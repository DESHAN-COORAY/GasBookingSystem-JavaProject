package Controller;

import java.sql.Statement;

/* @author KALPANA DESHAN*/
public class BookingAdd {
    Statement stmt;
    
    public void GasBookingLitro(String CLiName, String CLiCurrentAddress, String CLiDelivaryAddress, String CLiCity, String CLiNic, String CLiTelephone, String CLi2Kg, String CLi5Kg, String CLi12_5Kg, String CLiStatus) {
           try {
                stmt = DBConnection.getStatementConnection();
                stmt.executeUpdate("INSERT INTO customer_litro VALUES(NULL,'"+CLiName+"', '"+CLiCurrentAddress+"', '"+CLiDelivaryAddress+"', '"+CLiCity+"', '"+CLiNic+"', '"+CLiTelephone+"', '"+CLi2Kg+"', '"+CLi5Kg+"', '"+CLi12_5Kg+"', '"+CLiStatus+"')");
            } 
           catch (Exception e) {
                e.printStackTrace();
            }
    }
    
    public void GasBookingLaugfs(String CLaName, String CLaCurrentAddress, String CLaDelivaryAddress, String CLaCity, String CLaNic, String CLaTelephone, String CLa2Kg, String CLa5Kg, String CLa12_5Kg, String CLaStatus) {
           try {
                stmt = DBConnection.getStatementConnection();
                stmt.executeUpdate("INSERT INTO customer_laugfs VALUES(NULL,'"+CLaName+"', '"+CLaCurrentAddress+"', '"+CLaDelivaryAddress+"', '"+CLaCity+"', '"+CLaNic+"', '"+CLaTelephone+"', '"+CLa2Kg+"', '"+CLa5Kg+"', '"+CLa12_5Kg+"', '"+CLaStatus+"')");
            } 
           catch (Exception e) {
                e.printStackTrace();
            }
    }
    
}