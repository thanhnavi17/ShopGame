/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyShopGame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DataProvider {
    private static final String JDBC__DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String DATABASE_URL = "jdbc:sqlserver://ADMIN\\SQLEXPRESS;databaseName=QuanLyShopGame";
    
    public static Connection ketNoi()
    {
        Connection conn = null;
        
        try {
            //Nạp driver
            Class.forName(JDBC__DRIVER);
            //Kết nối đến db trong mysql cần làm việc
            conn = DriverManager.getConnection(DATABASE_URL, "sa", "thanhmac1701");
        } catch (ClassNotFoundException ex) {
            System.err.println("Lỗi không tìm thấy driver.Chi tiết: "+ex.getMessage());
        } catch(SQLException ex){
            System.err.println("Không kết nối được với database trên SQL. Chi tiết: "+ex.getMessage());
            
        }
        return conn;
    }
}
