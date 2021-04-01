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
public class SortByName implements Comparator<SanPham> {
    public SortByName(){
        
    }

    @Override
    public int compare(SanPham o1, SanPham o2) {
        return o1.getTenSP().compareTo(o2.getTenSP());
    }
    
}
