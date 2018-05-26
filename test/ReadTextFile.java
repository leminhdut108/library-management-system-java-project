
import Model.DBConnection;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hctha_000
 */
public class ReadTextFile {
    
    public static void main(String args[]) throws FileNotFoundException, IOException {
    
    
        String  line = "DG001, Lê Quốc An, 20146002, CN CNTT 2, K59, Nam, 1996-01-01, 0123456789, Ninh Bình, 2016-03-15";
        String[] docGia= new String[10];
        for(int i =0; i<9; i++){
        docGia[i] = line.substring(0, line.indexOf(",",0));
        line = line.substring(line.indexOf(",",0) + 1);
        }        
        try{
        String sqlAddDocGia = "INSERT INTO DocGia (MaDocGia, TenDocGia, Mssv, Lop, Khoa, GioiTinh, NgaySinh, Sdt, DiaChi, NgayTao) VALUES ( '"
                    + docGia[0].trim() + "','"
                    + docGia[1].trim() + "',"
                    + docGia[2].trim() + ",'"
                    + docGia[3].trim() + "','"
                    + docGia[4].trim() + "','"
                    + docGia[5].trim() + "','"
                    + docGia[6].trim() + "','"
                    + docGia[7].trim() + "','"
                    + docGia[8].trim() + "','"
                    + line.trim() + "');";
                    
        System.out.println(sqlAddDocGia);
        DBConnection dbAddDocGia = new DBConnection();
        dbAddDocGia.state.execute(sqlAddDocGia);
        System.out.println(sqlAddDocGia);
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +addDocGia", "ERROR", 2);
        }
        
}
}
        
        
        
    
    
    

