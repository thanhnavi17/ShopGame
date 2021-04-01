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
public class HoaDonBanImpl implements HoaDonBanDao {

    @Override
    public List<HoaDonBan> layDanhSach(int maKH) {
        //Khai báo 1 danh sách
        List<HoaDonBan> lstHDBan = new ArrayList();
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Tạo 1 công việc
            Statement comm;
            comm = conn.createStatement();
            //Khai báo công việc
            String strSQL = "Select * from HoaDonBan where KhachHangID = '"+maKH+"'";
            //Lấy kết quả trả về câu lệnh thực hiện
            ResultSet rs = comm.executeQuery(strSQL);
            
            //Xử lý từng dòng đưa vào danh sách
            HoaDonBan objHD;
            while(rs.next()){
                //Khởi tạo 1 đối tượng
                objHD = new HoaDonBan();
                objHD.setMaHD(rs.getString("MaHoaDon"));
                objHD.setTenHD(rs.getString("TenHoaDon"));
                objHD.setNgayBan(rs.getString("NgayBan"));
                objHD.setTongHD(rs.getFloat("TongHoaDon"));
                objHD.setMaKH(rs.getInt("KhachHangID"));
                
                lstHDBan.add(objHD);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonBanImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HoaDonBanImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return lstHDBan;
    }

    @Override
    public HoaDonBan layChiTiet(String id) {
        //Khai báo biến
        HoaDonBan objHD = null;
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Tạo 1 công việc
            Statement comm;
            comm = conn.createStatement();
            //Khai báo công việc
            String strSQL = "Select * from HoaDonBan where MaHD = '"+id+"'";
            //Lấy kết quả trả về câu lệnh thực hiện
            ResultSet rs = comm.executeQuery(strSQL);
            //Xử lý từng dòng đưa vào danh sách
            while(rs.next()){
                //Khởi tạo 1 đối tượng
                objHD = new HoaDonBan();
                objHD.setMaHD(rs.getString("MaHoaDon"));
                objHD.setTenHD(rs.getString("TenHoaDon"));
                objHD.setNgayBan(rs.getString("NgayBan"));
                objHD.setTongHD(rs.getFloat("TongHoaDon"));
                objHD.setMaKH(rs.getInt("KhachHangID"));
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonBanImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HoaDonBanImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return objHD;
    }

    @Override
    public boolean themMoi(HoaDonBan obj) {
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Khai báo công việc
            String strInsert = "Insert into HoaDonBan (MaHoaDon,TenHoaDon,NgayBan,TongHoaDon,KhachHangID) values (?,?,?,?,?)";
            //Tạo 1 công việc
            PreparedStatement comm = conn.prepareStatement(strInsert);
            
            //Truyền giá trị cho các tham số
                comm.setString(1, obj.getMaHD());
                comm.setString(2, obj.getTenHD());
                comm.setString(3, obj.getNgayBan());
                comm.setFloat(4, obj.getTongHD());
                comm.setInt(5, obj.getMaKH());
                
                return (comm.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonBanImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HoaDonBanImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return false;
    }

    @Override
    public boolean sua(HoaDonBan obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean xoa(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HoaDonBan> layDanhSach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
