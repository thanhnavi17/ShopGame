/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class LoaiSPImpl implements LoaiSPDao {

    @Override
    public List<LoaiSP> layDanhSach() {
        //Khai báo 1 danh sách
        List<LoaiSP> lstLoaiSP = new ArrayList();
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Tạo 1 công việc
            Statement comm;
            comm = conn.createStatement();
            //Khai báo công việc
            String strSQL = "Select LoaiSP,MaLoai from LoaiSP";
            //Lấy kết quả trả về câu lệnh thực hiện
            ResultSet rs = comm.executeQuery(strSQL);
            
            //Xử lý từng dòng đưa vào danh sách
            LoaiSP objLoai;
            while(rs.next()){
                //Khởi tạo 1 đối tượng
                objLoai = new LoaiSP();
                objLoai.setLoaiSP(rs.getString("LoaiSP"));
                objLoai.setMaLoai(rs.getString("MaLoai"));
                
                lstLoaiSP.add(objLoai);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSPImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoaiSPImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return lstLoaiSP;
    }

    @Override
    public LoaiSP layChiTiet(String id) {
        //Khai báo biến
        LoaiSP objLoai = null;
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Tạo 1 công việc
            Statement comm;
            comm = conn.createStatement();
            //Khai báo công việc
            String strSQL = "Select MaLoai,LoaiSP from LoaiSP where MaLoai = '"+id+"'";
            //Lấy kết quả trả về câu lệnh thực hiện
            ResultSet rs = comm.executeQuery(strSQL);
            
            //Xử lý từng dòng đưa vào danh sách
            
            while(rs.next()){
                
                //Khởi tạo 1 đối tượng
                objLoai = new LoaiSP();
                objLoai.setLoaiSP(rs.getString("LoaiSP"));
                objLoai.setMaLoai(rs.getString("MaLoai"));
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSPImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoaiSPImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return objLoai;
    }

    @Override
    public boolean themMoi(LoaiSP obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean sua(LoaiSP obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean xoa(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
