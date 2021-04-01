/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame.NguoiDung;

import QuanLyShopGame.DataProvider;
import QuanLyShopGame.SanPhamImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class NguoiDungImpl implements NguoiDungDao{

    @Override
    public NguoiDung ktraDangNhap(String userName) {
        NguoiDung objND = null;
        Connection conn = null;
            
        try {

            //Lấy thông tin kết nối đến sql cần làm việc
            conn = DataProvider.ketNoi();
            
            //Tạo 1 công việc
            Statement comm = conn.createStatement();
            
            //Khai báo công việc
            String strSQL = "Select * from KhachHang where Username='" + userName + "'";
            
            //Lấy kết quả trả về của câu lệnh thực hiện
            ResultSet rs = comm.executeQuery(strSQL);
            
            //Xử lý đọc từng dòng và đưa về danh sách
            while(rs.next())
            {
                //Khởi tạo 1 đối tượng
                objND  = new NguoiDung();
                
                objND.setMaKH(rs.getInt("MaKH"));
                objND.setTenKH(rs.getString("TenKH"));
                objND.setEmail(rs.getString("Email"));
                objND.setDienThoai(rs.getString("DienThoai"));
                objND.setDiaChi(rs.getString("DiaChi"));
                objND.setUserName(rs.getString("Username"));
                objND.setPassword(rs.getString("Password"));
                objND.setTaiKhoan(rs.getFloat("TaiKhoan"));
                objND.setVaiTroID(rs.getInt("VaiTroID"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDungImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn != null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NguoiDungImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        //Trả về người dùng
        return objND;
    }

    @Override
    public List<NguoiDung> layDanhSach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NguoiDung layChiTiet(Integer id) {
        //Khai báo biến
        NguoiDung objND = null;
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Tạo 1 công việc
            Statement comm;
            comm = conn.createStatement();
            //Khai báo công việc
            String strSQL = "Select MaKH,TenKH,Email,DienThoai,DiaChi,Username,Password,TaiKhoan,DiemThuong,image from KhachHang where MaKH = '"+id+"'";
            //Lấy kết quả trả về câu lệnh thực hiện
            ResultSet rs = comm.executeQuery(strSQL);
            //Xử lý từng dòng đưa vào danh sách
            while(rs.next()){
                //Khởi tạo 1 đối tượng
                objND = new NguoiDung();
                objND.setMaKH(rs.getInt("MaKH"));
                objND.setTenKH(rs.getString("TenKH"));
                objND.setEmail(rs.getString("Email"));
                objND.setDienThoai(rs.getString("DienThoai"));
                objND.setDiaChi(rs.getString("DiaChi"));
                objND.setUserName(rs.getString("Username"));
                objND.setPassword(rs.getString("Password"));
                objND.setTaiKhoan(rs.getFloat("TaiKhoan"));
                objND.setDiemThuong(rs.getInt("DiemThuong"));
                objND.setImgND(rs.getBytes("image"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDungImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NguoiDungImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return objND;
    }

    @Override
    public boolean themMoi(NguoiDung objND) {
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Khai báo công việc
            String strInsert = "Insert into KhachHang (TenKH,Email,DienThoai,DiaChi,Username,Password,TaiKhoan,VaiTroID) values (?,?,?,?,?,?,?,?)";
            //Tạo 1 công việc
            PreparedStatement comm = conn.prepareStatement(strInsert);
            
            //Truyền giá trị cho các tham số
            
                comm.setString(1, objND.getTenKH());
                comm.setString(2, objND.getEmail());
                comm.setString(3, objND.getDienThoai());
                comm.setString(4, objND.getDiaChi());
                comm.setString(5, objND.getUserName());
                comm.setString(6, objND.getPassword());
                comm.setFloat(7, objND.getTaiKhoan());
                comm.setInt(8, objND.getVaiTroID());
                
                return (comm.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDungImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NguoiDungImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return false;
    }

    @Override
    public boolean sua(NguoiDung obj) {
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Khai báo công việc
            String strUpdate = "Update KhachHang set TenKH=?,Email=?,DienThoai=?,DiaChi=?,Password=?,TaiKhoan=?,DiemThuong=?,image=? where MaKH =?";
            //Tạo 1 công việc
            PreparedStatement comm = conn.prepareStatement(strUpdate);
            
            //Truyền giá trị cho các tham số
            
                
                comm.setString(1, obj.getTenKH());
                comm.setString(2, obj.getEmail());
                comm.setString(3, obj.getDienThoai());
                comm.setString(4, obj.getDiaChi());
                comm.setString(5, obj.getPassword());
                comm.setFloat(6, obj.getTaiKhoan());
                comm.setInt(7, obj.getDiemThuong());
                comm.setBytes(8, obj.getImgND());
                comm.setInt(9, obj.getMaKH());
                return (comm.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDungImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NguoiDungImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return false;
    }

    @Override
    public boolean xoa(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
