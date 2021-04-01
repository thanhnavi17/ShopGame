/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame.HoaDonBan;

/**
 *
 * @author Admin
 */
public class HoaDonBan {
    String maHD;
    String tenHD;
    String ngayBan;
    float tongHD;
    int maKH;

    public float getTongHD() {
        return tongHD;
    }

    public void setTongHD(float tongHD) {
        this.tongHD = tongHD;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }
    

    public String getTenHD() {
        return tenHD;
    }

    public void setTenHD(String tenHD) {
        this.tenHD = tenHD;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }
    
    public HoaDonBan(){
        
    }
    
    public HoaDonBan(String maHD,String tenHD,String ngayBan,float tongHD,int maKH){
        this.maHD = maHD;
        this.tenHD = tenHD;
        this.ngayBan = ngayBan;
        this.tongHD = tongHD;
        this.maKH = maKH;
    }
}
