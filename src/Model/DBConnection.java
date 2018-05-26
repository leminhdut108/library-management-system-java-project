package Model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

// Le Ngoc Long - 20142659
public class DBConnection {
 private final  String DB_URL = "jdbc:mysql://localhost:3306/quanlythuvien?autoReconnect=true&useSSL=false";//Địa chỉ DataBase
    private final  String USER = "root"; // username
    private final  String PASSWORD = "mysql"; //Mật khẩu
    public Statement state = null; //Statement ~ một câu lệnh SQL
    public  Connection conn = null; //Kết nối
    public CallableStatement call = null;
    public PreparedStatement prep = null;
    public ResultSet result = null; //ResultSet đại diện cho tập hợp các bản ghi lấy do thực hiện truy vấn.
    
    
    
    
    
    
    public void getConnection() {
        try {
            //Đăng ký Driver
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            this.conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            this.state = this.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            
        } catch (SQLException e) {
            System.err.println("Không thể kết nối : " + e);
        }
    }
    public void freeConnection() {
        try {
            this.state.close();
            this.conn.close();
        } catch (SQLException e) {
            System.err.println("Không thể đóng kết nối : " + e);
        }
    }
     public void excuteQuery(String query) {
        this.result = null;
        try {
          this.result = this.state.executeQuery(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +DBConnection.excuteQuery", "ERROR", 2);
        }

    }

}
