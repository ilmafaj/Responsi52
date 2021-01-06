package responsi124190052;

import com.sun.jdi.connect.spi.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ModelResponsi {
    
      
    ModelResponsi mr;
    ViewResponsi vr;
    FormDaftar fd;
    Dashboard dash;
            
  public class ModelResponsi {
    
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/responsi2";
    static final String USER = "root";
    static final String PASS = "";
    java.sql.Connection koneksi;
    java.sql.Statement statement;
    
    public ModelResponsi(){
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/responsi2?serverTimezone=UTC", "root", "");
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println(ex);
        }
    }
    
 