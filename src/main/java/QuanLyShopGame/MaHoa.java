/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Admin
 */
public class MaHoa {
    public static String maHoa(String password){
        String kq = "";
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("MD5");
            digest.update(password.getBytes());
            BigInteger bigI = new BigInteger(1,digest.digest());
            kq = bigI.toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return kq;
    }
}
