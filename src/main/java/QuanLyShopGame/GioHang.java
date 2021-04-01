/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame;

import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class GioHang {
    String maSP = "";
    int soLuong = 0;
    float gia = 0;
    float thanhTien = 0;
    int maKH;
    byte[] img;
    
//    public ImageIcon getImage(){
//        return new ImageIcon(img);
//    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
    

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }
    
    public GioHang()
    {
        
    }
    
    public GioHang(String maSP,int soLuong,float gia,float thanhTien,int maKH,byte[] img)
    {
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.gia = gia;
        this.thanhTien = thanhTien;
        this.maKH = maKH;
        this.img = img;
    }
}
