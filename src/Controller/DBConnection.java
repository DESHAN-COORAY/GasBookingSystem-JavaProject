package Controller;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/* @author KALPANA DESHAN*/
public class DBConnection {
    
    static java.sql.Connection conn;
    static java.sql.Statement stat = null;
    
    public static java.sql.Statement getStatementConnection(){
        try{
            
        //Establish the Connection
        String url = "jdbc:mysql://localhost:3306/gasbookingsystem";
        conn = DriverManager.getConnection(url, "root","");

        //Create the Connection
        stat = conn.createStatement();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "SQL Connected Fail!!!");
        }
            return stat;
    }
    
    //Close the Connection
    public static void closeCon() throws SQLException {
        conn.close();
    }
}
