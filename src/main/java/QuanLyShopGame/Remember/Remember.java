/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame.Remember;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Remember {
    public static String doc()
    {
        String noiDung = "";
        try {
			FileReader fr = new FileReader("E:\\Java\\HocVien\\macanhthanh\\Project_QuanLyShopGame\\src\\main\\java\\QuanLyShopGame\\Remember\\remember\\remember.txt");
			
			//Dua noi dung vao bo dem cua may tinh
			BufferedReader br = new BufferedReader(fr);
			
			//Khai bao bien
			String dong = "";
			
			//Doc den khi k con thong tin
			while((dong = br.readLine())!=null) {
				noiDung += dong + "\r\n";
			}
			
			//Dong luong
			br.close();
                        fr.close();
                        } catch (FileNotFoundException e) {
			System.err.println("Khong tim thay file.Chi tiet: "+e.getMessage());
		} catch (IOException e) {
			System.err.println("Bi loi trong qua trinh doc file.Chi tiet: " + e.getMessage());
                }
        return noiDung;
    }
    
    public static void ghi(String user,String pass)
    {
        //Ghi thông tin ra file
        try {
			FileWriter fw = new FileWriter("E:\\Java\\HocVien\\macanhthanh\\Project_QuanLyShopGame\\src\\main\\java\\QuanLyShopGame\\Remember\\remember\\remember.txt");
			
			//Nội dung cần ghỉa file
			fw.write(user);
                        fw.write(" ");
                        fw.write(pass);			
			//Đẩy dữ liệu để lưu xuống file
			fw.flush();
			//Đóng luồng 
			fw.close();
			
			System.out.println("Ghi dữ liệu ra file thành công!");
        } catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Ghi nội dung ra file bị lỗi. Chi tiết: "
                    + e.getMessage());
		}
    }
}
