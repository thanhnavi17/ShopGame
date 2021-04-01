/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame.NguoiDung;

import QuanLyShopGame.HanhDong;

/**
 *
 * @author Admin
 */
public interface NguoiDungDao extends HanhDong<NguoiDung,Integer>{
    NguoiDung ktraDangNhap(String userName);
}
