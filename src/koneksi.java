
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class koneksi {
    Connection conn;
    Statement st;
    ResultSet rs;
    
    
    public void setkoneksi()throws SQLException{
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/tubesjavalanjut","root","");
            st=conn.createStatement();
            
              
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Gagal Koneksi"+e.getMessage());
        }
        
        
    }
            
    
    
}
