/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame;

/**
 *
 * @author Admin
 */
public class SanPham {
    String maSP = "";
    String tenSP = "";
    float gia = 0;
    int soLuong = 0;
    String maNPH = "";
    String ghiChu = "";
    String maLoai = "";
    byte[] img;
    int luotMua = 0;

    public int getLuotMua() {
        return luotMua;
    }

    public void setLuotMua(int luotMua) {
        this.luotMua = luotMua;
    }
    
    

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

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMaNPH() {
        return maNPH;
    }

    public void setMaNPH(String maNPH) {
        this.maNPH = maNPH;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }
    
    
    
    public SanPham(){
        
    }
    
    public SanPham(String maSP,String tenSP,float gia,int soLuong,String maNPH,String ghiChu,String maLoai,byte[] img,int luotMua){
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
        this.maNPH = maNPH;
        this.ghiChu = ghiChu;
        this.maLoai = maLoai;
        this.img = img;
        this.luotMua = luotMua;
    }
}
