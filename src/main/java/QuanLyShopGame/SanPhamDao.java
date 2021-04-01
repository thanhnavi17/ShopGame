/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface SanPhamDao extends HanhDong<SanPham,String>{
    List<SanPham> layDanhSach(int soTrang);
    List<SanPham> timKiemSanPham(String tuKhoa,String maLoai);
    List<SanPham> timKiemSanPham(String maLoai);
    public int soLuongSP();
    List<SanPham> dstop4LuotMua();
    SanPham chiTietSP(String tenSP);
}
