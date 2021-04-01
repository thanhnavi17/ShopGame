/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame.HoaDonBan;

import QuanLyShopGame.HanhDong;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface HoaDonBanCTDao extends HanhDong<HoaDonBanCT,String> {
    List<HoaDonBanCT> layDanhSach(String maHD);
}
