/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame;

import QuanLyShopGame.NguoiDung.NguoiDung;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;

/**
 *
 * @author Admin
 */
public class SendMail {
    private static NguoiDung user = null;

    public static NguoiDung getUser() {
        return user;
    }

    public static void setUser(NguoiDung user) {
        SendMail.user = user;
    }
    
    public static void sendMail(String nguoiNhan) 
    {
        //Thiết lập mail server
        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        String myEmail = "thanh.navi17@gmail.com";
        String pass = "baochiii";
        //Mail session
        Session session = Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myEmail,pass);
            } 
        });
        
        Message message = prepareMessage(session, myEmail,nguoiNhan);
        
        try {
            //Gửi mail
            Transport.send(message);
        } catch (MessagingException ex) {
            Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Gửi mail thành công");
    }
    
    private static Message prepareMessage(Session session,String myEmail,String nguoiNhan){
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(nguoiNhan));
            message.setSubject("Recovery your password");
            message.setText("Co moi cai pass cung khong nho, ngu the? \n Your code is : "+user.getRecoveryCode());
            return message;
        } catch (Exception e) {
            Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
}
