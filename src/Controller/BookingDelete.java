package Controller;

import java.sql.Statement;

/** @author KALPANA DESHAN*/
public class BookingDelete {
    Statement stmt;
    
    public void GasBookingDeleteLitro(String val4) {
           try {
                stmt = DBConnection.getStatementConnection();
                stmt.executeUpdate("DELETE FROM customer_litro WHERE CLiId = '"+val4+"'");
            } 
           catch (Exception e) {
                e.printStackTrace();
            }
    }
    
    public void GasBookingDeleteLaugfs(String val6) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("DELETE FROM customer_laugfs WHERE CLaId = '"+val6+"' ");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
