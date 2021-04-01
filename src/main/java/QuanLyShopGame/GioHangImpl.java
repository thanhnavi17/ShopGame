/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame;

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
public class GioHangImpl implements GioHangDao{

    @Override
    public List<GioHang> layDanhSach() {
        //Khai báo 1 danh sách
        List<GioHang> lstGioHang = new ArrayList();
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Tạo 1 công việc
            Statement comm;
            comm = conn.createStatement();
            //Khai báo công việc
            String strSQL = "Select * from GioHang";
            //Lấy kết quả trả về câu lệnh thực hiện
            ResultSet rs = comm.executeQuery(strSQL);
            
            //Xử lý từng dòng đưa vào danh sách
            GioHang objGH;
            while(rs.next()){
                //Khởi tạo 1 đối tượng
                objGH = new GioHang();
                objGH.setMaSP(rs.getString("MaSP"));
                objGH.setSoLuong(rs.getInt("SoLuong"));
                objGH.setGia(rs.getFloat("Gia"));
                objGH.setThanhTien(rs.getFloat("ThanhTien"));
                objGH.setMaKH(rs.getInt("KhachHangID"));
                objGH.setImg(rs.getBytes("image"));
                lstGioHang.add(objGH);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GioHangImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GioHangImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return lstGioHang;
    }

    @Override
    public GioHang layChiTiet(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean themMoi(GioHang objGH) {
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Khai báo công việc
            String strInsert = "Insert into GioHang (MaSP,SoLuong,Gia,ThanhTien,KhachHangID,image) values (?,?,?,?,?,?)";
            //Tạo 1 công việc
            PreparedStatement comm = conn.prepareStatement(strInsert);
            
            //Truyền giá trị cho các tham số
            
                comm.setString(1, objGH.getMaSP());
                comm.setInt(2, objGH.getSoLuong());
                comm.setFloat(3, objGH.getGia());
                comm.setFloat(4, objGH.getThanhTien());
                comm.setInt(5, objGH.getMaKH());
                comm.setBytes(6, objGH.getImg());
                return (comm.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(GioHangImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GioHangImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return false;
    }

    @Override
    public boolean sua(GioHang obj) {
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Khai báo công việc
            String strUpdate = "Update GioHang set Gia =?,SoLuong=?,ThanhTien=?,image =? where MaSP =?";
            //Tạo 1 công việc
            PreparedStatement comm = conn.prepareStatement(strUpdate);
            
            //Truyền giá trị cho các tham số
            
                
                
                comm.setFloat(1, obj.getGia());
                comm.setInt(2, obj.getSoLuong());
                comm.setFloat(3, obj.getThanhTien());
                
                comm.setString(4, obj.getMaSP());
                return (comm.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(GioHangImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GioHangImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return false;
    }

    @Override
    public boolean xoa(String id) {
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Khai báo công việc
            String strDelete = "Delete from GioHang where MaSP =?";
            //Tạo 1 công việc
            PreparedStatement comm = conn.prepareStatement(strDelete);
            
            //Truyền giá trị cho các tham số
            
                comm.setString(1, id);
                
                return (comm.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(GioHangImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GioHangImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return false;
    }

    @Override
    public float tongHoaDon(int maKH) {
        float tong = 0;
        //Khai báo 1 danh sách
        List<GioHang> lstGioHang = new ArrayList();
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Tạo 1 công việc
            Statement comm;
            comm = conn.createStatement();
            //Khai báo công việc
            String strSQL = "Select SUM(ThanhTien) as TongHoaDon from GioHang where KhachHangId = "+maKH;
            //Lấy kết quả trả về câu lệnh thực hiện
            ResultSet rs = comm.executeQuery(strSQL);
            while(rs.next())
            {
                tong = rs.getFloat("TongHoaDon");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(GioHangImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GioHangImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return tong;
    }

    @Override
    public boolean xoaTatCa(String id) {
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Khai báo công việc
            String strDelete = "Delete from GioHang where KhachHangID =?";
            //Tạo 1 công việc
            PreparedStatement comm = conn.prepareStatement(strDelete);
            
            //Truyền giá trị cho các tham số
            
                comm.setString(1, id);
                
                return (comm.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(GioHangImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GioHangImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return false;
    }

    @Override
    public List<GioHang> timKiemGioHang(int maKH) {
        //Khai báo 1 danh sách
        List<GioHang> lstGioHang = new ArrayList();
        //Khai báo 1 kết nối
        Connection conn = null;
            
        try {

            //Lấy thông tin kết nối đến mysql cần làm việc
            conn = DataProvider.ketNoi();
            
            //Tạo 1 công việc
            Statement comm = conn.createStatement();
            
            //Khai báo xử lý câu lệnh truy vấn tìm kiếm
            String strSQL = "Select * from GioHang where KhachHangID = '" + maKH + "'";
            
            
            //Lấy kết quả trả về của câu lệnh thực hiện
            ResultSet rs = comm.executeQuery(strSQL);
            GioHang objGH;
            //Xử lý đọc từng dòng và đưa về danh sách
            
            while(rs.next())
            {
                //Khởi tạo 1 đối tượng
                objGH = new GioHang();
                
                objGH.setMaSP(rs.getString("MaSP"));
                objGH.setSoLuong(rs.getInt("SoLuong"));
                objGH.setGia(rs.getFloat("Gia"));
                objGH.setThanhTien(rs.getFloat("ThanhTien"));
                objGH.setMaKH(rs.getInt("KhachHangID"));
                objGH.setImg(rs.getBytes("image"));
                lstGioHang.add(objGH);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(GioHangImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn != null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GioHangImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        //Trả về danh sách
        return lstGioHang;
    }

    
    
}
