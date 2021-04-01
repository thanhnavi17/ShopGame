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
public class SanPhamImpl implements SanPhamDao {

    @Override
    public List<SanPham> layDanhSach(int soTrang) {
        //Khai báo 1 danh sách
        List<SanPham> lstSanPham = new ArrayList();
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Tạo 1 công việc
            Statement comm;
            comm = conn.createStatement();
            //Khai báo công việc
            String strSQL = "exec SP_DSSanPhamPage 5,"+ soTrang + ";";
            //Lấy kết quả trả về câu lệnh thực hiện
            ResultSet rs = comm.executeQuery(strSQL);
            
            //Xử lý từng dòng đưa vào danh sách
            SanPham objSP;
            while(rs.next()){
                //Khởi tạo 1 đối tượng
                objSP = new SanPham();
                objSP.setMaSP(rs.getString("MaSP"));
                objSP.setTenSP(rs.getString("TenSP"));
                objSP.setGia(rs.getFloat("Gia"));
                objSP.setSoLuong(rs.getInt("SoLuongTon"));
                objSP.setMaNPH(rs.getString("MaNPH"));
                objSP.setGhiChu(rs.getString("GhiChu"));
                objSP.setMaLoai(rs.getString("MaLoai"));
                objSP.setImg(rs.getBytes("image"));
                lstSanPham.add(objSP);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return lstSanPham;
    }

    @Override
    public SanPham layChiTiet(String id) {
        //Khai báo biến
        SanPham objSP = null;
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Tạo 1 công việc
            Statement comm;
            comm = conn.createStatement();
            //Khai báo công việc
            String strSQL = "Select MaSP,TenSP,Gia,SoLuongTon,MaNPH,GhiChu,MaLoai,image,LuotMua from SanPham where MaSP = '"+id+"'";
            //Lấy kết quả trả về câu lệnh thực hiện
            ResultSet rs = comm.executeQuery(strSQL);
            
            //Xử lý từng dòng đưa vào danh sách
            
            while(rs.next()){
                
                //Khởi tạo 1 đối tượng
                objSP = new SanPham();
                objSP.setMaSP(rs.getString("MaSP"));
                objSP.setTenSP(rs.getString("TenSP"));
                objSP.setGia(rs.getFloat("Gia"));
                objSP.setSoLuong(rs.getInt("SoLuongTon"));
                objSP.setMaNPH(rs.getString("MaNPH"));
                objSP.setGhiChu(rs.getString("GhiChu"));
                objSP.setMaLoai(rs.getString("MaLoai"));
                objSP.setImg(rs.getBytes("image"));
                objSP.setLuotMua(rs.getInt("LuotMua"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return objSP;
    }

    @Override
    public boolean themMoi(SanPham objSP) {
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Khai báo công việc
            String strInsert = "Insert into SanPham (MaSP,TenSP,Gia,SoLuongTon,MaNPH,GhiChu,MaLoai,image,LuotMua) values (?,?,?,?,?,?,?,?,?)";
            //Tạo 1 công việc
            PreparedStatement comm = conn.prepareStatement(strInsert);
            
            //Truyền giá trị cho các tham số
            
                comm.setString(1, objSP.getMaSP());
                comm.setString(2, objSP.getTenSP());
                comm.setFloat(3, objSP.getGia());
                comm.setInt(4, objSP.getSoLuong());
                comm.setString(5, objSP.getMaNPH());
                comm.setString(6, objSP.getGhiChu());
                comm.setString(7, objSP.getMaLoai());
                comm.setBytes(8, objSP.getImg());
                comm.setInt(9, 0);
                return (comm.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return false;
    }

    @Override
    public boolean sua(SanPham objSP) {
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Khai báo công việc
            String strUpdate = "Update SanPham set TenSP =?,Gia =?,SoLuongTon=?,MaNPH=?,GhiChu = ?,MaLoai =?,image =?,LuotMua=? where MaSP =?";
            //Tạo 1 công việc
            PreparedStatement comm = conn.prepareStatement(strUpdate);
            
            //Truyền giá trị cho các tham số
            
                
                comm.setString(1, objSP.getTenSP());
                comm.setFloat(2, objSP.getGia());
                comm.setInt(3, objSP.getSoLuong());
                comm.setString(4, objSP.getMaNPH());
                comm.setString(5, objSP.getGhiChu());
                comm.setString(6, objSP.getMaLoai());
                comm.setBytes(7, objSP.getImg());
                comm.setInt(8, objSP.getLuotMua());
                comm.setString(9, objSP.getMaSP());
                return (comm.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
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
            String strDelete = "Delete from SanPham where MaSP =?";
            //Tạo 1 công việc
            PreparedStatement comm = conn.prepareStatement(strDelete);
            
            //Truyền giá trị cho các tham số
            
                comm.setString(1, id);
                
                return (comm.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return false;
    }

    @Override
    public List<SanPham> timKiemSanPham(String tuKhoa, String maLoai) {
        //Khai báo 1 danh sách
        List<SanPham> lstSanPham = new ArrayList();
        //Khai báo 1 kết nối
        Connection conn = null;
            
        try {

            //Lấy thông tin kết nối đến mysql cần làm việc
            conn = DataProvider.ketNoi();
            
            //Tạo 1 công việc
            Statement comm = conn.createStatement();
            
            //Khai báo xử lý câu lệnh truy vấn tìm kiếm
            String strSQL = "Select * from SanPham where 1=1";
            
            if(!tuKhoa.isEmpty())
            {
                strSQL += " AND (MaSP = '" + tuKhoa + "' OR TenSP like '%" + tuKhoa + "%')";
            }
            
            if(!maLoai.isEmpty())
            {
                strSQL += " AND MaLoai = '" + maLoai + "'";
            }
            
            //Lấy kết quả trả về của câu lệnh thực hiện
            ResultSet rs = comm.executeQuery(strSQL);
            
            //Xử lý đọc từng dòng và đưa về danh sách
            SanPham objSP;
            while(rs.next())
            {
                //Khởi tạo 1 đối tượng
                objSP = new SanPham();
                
                objSP.setMaSP(rs.getString("MaSP"));
                objSP.setTenSP(rs.getString("TenSP"));
                objSP.setGia(rs.getFloat("Gia"));
                objSP.setSoLuong(rs.getInt("SoLuongTon"));
                objSP.setMaNPH(rs.getString("MaNPH"));
                objSP.setGhiChu(rs.getString("GhiChu"));
                objSP.setMaLoai(rs.getString("MaLoai"));
                objSP.setImg(rs.getBytes("image"));
                //Thêm vào danh sách
                lstSanPham.add(objSP);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn != null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        //Trả về danh sách
        return lstSanPham;
    }

    @Override
    public List<SanPham> timKiemSanPham(String maLoai) {
        //Khai báo 1 danh sách
        List<SanPham> lstSanPham = new ArrayList();
        //Khai báo 1 kết nối
        Connection conn = null;
            
        try {

            //Lấy thông tin kết nối đến mysql cần làm việc
            conn = DataProvider.ketNoi();
            
            //Tạo 1 công việc
            Statement comm = conn.createStatement();
            
            //Khai báo xử lý câu lệnh truy vấn tìm kiếm
            String strSQL = "Select * from SanPham where MaLoai = '" + maLoai + "'";
            
            
            //Lấy kết quả trả về của câu lệnh thực hiện
            ResultSet rs = comm.executeQuery(strSQL);
            SanPham objSP;
            //Xử lý đọc từng dòng và đưa về danh sách
            
            while(rs.next())
            {
                //Khởi tạo 1 đối tượng
                objSP = new SanPham();
                
                objSP.setMaSP(rs.getString("MaSP"));
                objSP.setTenSP(rs.getString("TenSP"));
                objSP.setGia(rs.getFloat("Gia"));
                objSP.setSoLuong(rs.getInt("SoLuongTon"));
                objSP.setMaNPH(rs.getString("MaNPH"));
                objSP.setGhiChu(rs.getString("GhiChu"));
                objSP.setMaLoai(rs.getString("MaLoai"));
                objSP.setImg(rs.getBytes("image"));
                //Thêm vào danh sách
                lstSanPham.add(objSP);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn != null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        //Trả về danh sách
        return lstSanPham;
    }

    @Override
    public List<SanPham> layDanhSach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int soLuongSP() {
        int soLuong = 0;
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Tạo 1 công việc
            Statement comm;
            comm = conn.createStatement();
            //Khai báo công việc
            String strSQL = "Select count(*) as SoLuongSP from SanPham";
            //Lấy kết quả trả về câu lệnh thực hiện
            ResultSet rs = comm.executeQuery(strSQL);
            
            //Xử lý từng dòng đưa vào danh sách
            
            while(rs.next()){
                //Khởi tạo 1 đối tượng
                soLuong = rs.getInt("SoLuongSP");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return soLuong;
    }

    @Override
    public List<SanPham> dstop4LuotMua() {
        //Khai báo 1 danh sách
        List<SanPham> lstTop4 = new ArrayList();
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Tạo 1 công việc
            Statement comm;
            comm = conn.createStatement();
            //Khai báo công việc
            String strSQL = "Select top 4 TenSP,Gia,image from SanPham order by LuotMua desc;";
            //Lấy kết quả trả về câu lệnh thực hiện
            ResultSet rs = comm.executeQuery(strSQL);
            
            //Xử lý từng dòng đưa vào danh sách
            SanPham objSP;
            while(rs.next()){
                //Khởi tạo 1 đối tượng
                objSP = new SanPham();
                
                objSP.setTenSP(rs.getString("TenSP"));
                objSP.setGia(rs.getFloat("Gia"));
                objSP.setImg(rs.getBytes("image"));
                lstTop4.add(objSP);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return lstTop4;
    }

    @Override
    public SanPham chiTietSP(String tenSP) {
        //Khai báo biến
        SanPham objSP = null;
        //Khai báo 1 kết nối
        Connection conn = null;
        try {
            //lấy thông tin kết nối đến sql server cần làm việc
            conn = DataProvider.ketNoi();
            //Tạo 1 công việc
            Statement comm;
            comm = conn.createStatement();
            //Khai báo công việc
            String strSQL = "Select MaSP,TenSP,Gia,SoLuongTon,MaNPH,GhiChu,MaLoai,image,LuotMua from SanPham where TenSP = N'"+tenSP+"'";
            //Lấy kết quả trả về câu lệnh thực hiện
            ResultSet rs = comm.executeQuery(strSQL);
            
            //Xử lý từng dòng đưa vào danh sách
            
            while(rs.next()){
                
                //Khởi tạo 1 đối tượng
                objSP = new SanPham();
                objSP.setMaSP(rs.getString("MaSP"));
                objSP.setTenSP(rs.getString("TenSP"));
                objSP.setGia(rs.getFloat("Gia"));
                objSP.setSoLuong(rs.getInt("SoLuongTon"));
                objSP.setMaNPH(rs.getString("MaNPH"));
                objSP.setGhiChu(rs.getString("GhiChu"));
                objSP.setMaLoai(rs.getString("MaLoai"));
                objSP.setImg(rs.getBytes("image"));
                objSP.setLuotMua(rs.getInt("LuotMua"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally//Nếu thực hiện xong hoặc có lỗi thì luôn cần đóng kết nối với db nếu có
        {
            if(conn!=null){
                try {
                    //Đóng kết nối
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPhamImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Trả về danh sách
        return objSP;
    }
    
    
    
}
