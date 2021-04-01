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
public interface GioHangDao extends HanhDong<GioHang,String>{
    public float tongHoaDon(int maKH);
    boolean xoaTatCa(String id);
    List<GioHang> timKiemGioHang(int maKH);
}
