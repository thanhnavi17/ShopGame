/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame.HoaDonBan;

import QuanLyShopGame.DataProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class HoaDonBanCTImpl implements HoaDonBanCTDao{

    @Override
    public List<HoaDonBanCT> layDanhSach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HoaDonBanCT layChiTiet(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean themMoi(HoaDonBanCT obj) {
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Khai báo công việc
            String strInsert = "Insert into HoaDonBanChiTiet (HoaDonID,MaSP,SoLuong,GiaBan) values (?,?,?,?)";
            //Tạo 1 công việc
            PreparedStatement comm = conn.prepareStatement(strInsert);
            
            //Truyền giá trị cho các tham số
            
                comm.setString(1, obj.getMaHD());
                comm.setString(2, obj.getMaSP());
                comm.setInt(3, obj.getSoLuong());
                comm.setFloat(4, obj.getGiaBan());
                
                return (comm.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonBanCTImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HoaDonBanCTImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return false;
    }

    @Override
    public boolean sua(HoaDonBanCT obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean xoa(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HoaDonBanCT> layDanhSach(String maHD) {
        //Khai báo 1 danh sách
        List<HoaDonBanCT> lstChiTiet = new ArrayList();
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Tạo 1 công việc
            Statement comm;
            comm = conn.createStatement();
            //Khai báo công việc
            String strSQL = "Select * from HoaDonBanChiTiet where HoaDonID = '"+maHD+"'";
            //Lấy kết quả trả về câu lệnh thực hiện
            ResultSet rs = comm.executeQuery(strSQL);
            
            //Xử lý từng dòng đưa vào danh sách
            HoaDonBanCT objHD;
            while(rs.next()){
                //Khởi tạo 1 đối tượng
                objHD = new HoaDonBanCT();
                objHD.setMaHD(rs.getString("HoaDonID"));
                objHD.setMaSP(rs.getString("MaSP"));
                objHD.setSoLuong(rs.getInt("SoLuong"));
                objHD.setGiaBan(rs.getFloat("GiaBan"));
                
                lstChiTiet.add(objHD);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonBanCTImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HoaDonBanCTImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return lstChiTiet;
    }
    
}
