/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame;

import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class SortByPrice implements Comparator<SanPham>{
    public SortByPrice()
    {
        
    }

    @Override
    public int compare(SanPham o1, SanPham o2) {
        if (o1.getGia()> o2.getGia()) {
            return 1;
        } else if (o1.getGia()== o2.getGia()) {
            return 0;
        } else {
            return -1;
        }
    }
    
}
