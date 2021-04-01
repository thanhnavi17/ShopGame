/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame.NguoiDung;

/**
 *
 * @author Admin
 */
public class NguoiDung {
    int maKH;
    String tenKH = "";
    String email = "";
    String dienThoai = "";
    String diaChi = "";
    String userName = "";
    String password = "";
    float taiKhoan = 0;
    int vaiTroID;
    int diemThuong = 0;
    String recoveryCode = "";
    byte[] imgND;

    public byte[] getImgND() {
        return imgND;
    }

    public void setImgND(byte[] imgND) {
        this.imgND = imgND;
    }
    
    

    public int getDiemThuong() {
        return diemThuong;
    }

    public void setDiemThuong(int diemThuong) {
        this.diemThuong = diemThuong;
    }

    public String getRecoveryCode() {
        return recoveryCode;
    }

    public void setRecoveryCode(String recoveryCode) {
        this.recoveryCode = recoveryCode;
    }
    
    

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(float taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public int getVaiTroID() {
        return vaiTroID;
    }

    public void setVaiTroID(int vaiTroID) {
        this.vaiTroID = vaiTroID;
    }
    
    public NguoiDung()
    {
        
    }
    
    public NguoiDung(int maKH,String tenKH,String email,String dienThoai,String diaChi,String userName,String password,int diemThuong,float taiKhoan,int vaiTroID,byte[] imgND)
    {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.email = email;
        this.dienThoai = dienThoai;
        this.diaChi = diaChi;
        this.userName = userName;
        this.password = password;
        this.taiKhoan = taiKhoan;
        this.vaiTroID = vaiTroID;
        this.diemThuong = diemThuong;
        this.imgND = imgND;
    }
}
