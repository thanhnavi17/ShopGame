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
public interface HanhDong<T,idT> {
    List<T> layDanhSach();
    T layChiTiet(idT id);
    boolean themMoi(T obj);
    boolean sua(T obj);
    boolean xoa(idT id);
}
