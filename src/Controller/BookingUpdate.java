package Controller;

import java.sql.Statement;

/** @author KALPANA DESHAN*/
public class BookingUpdate{
    
    Statement stmt;
    public void GasBookingUpdateLitro(String CLiName, String CLiCurrentAddress, String CLiDelivaryAddress, String CLiCity, String CLiNic, String CLiTelephone, String CLi2Kg, String CLi5Kg, String CLi12_5Kg, String val3, String val4) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE customer_litro SET CLiName = '"+CLiName+"', CLiCurrentAddress = '"+CLiCurrentAddress+"', CLiDeliveryAddress = '"+CLiDelivaryAddress+"', CLiCity = '"+CLiCity+"', CLiNic = '"+CLiNic+"', CLiTelephone = '"+CLiTelephone+"', CLi2Kg = '"+CLi2Kg+"', CLi5Kg = '"+CLi5Kg+"', CLi12_5Kg = '"+CLi12_5Kg+"' WHERE CLiNic = '"+val3+"' AND CLiId = '"+val4+"'");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void GasBookingUpdateLaugfs(String CLaName, String CLaCurrentAddress, String CLaDelivaryAddress, String CLaCity, String CLaNic, String CLaTelephone, String CLa2Kg, String CLa5Kg, String CLa12_5Kg, String val5, String val6) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE customer_laugfs SET CLaName = '"+CLaName+"', CLaCurrentAddress = '"+CLaCurrentAddress+"', CLaDeliveryAddress = '"+CLaDelivaryAddress+"', CLaCity = '"+CLaCity+"', CLaNic = '"+CLaNic+"', CLaTelephone = '"+CLaTelephone+"', CLa2Kg = '"+CLa2Kg+"', CLa5Kg = '"+CLa5Kg+"', CLa12_5Kg = '"+CLa12_5Kg+"' WHERE CLaNic = '"+val5+"' AND CLaId = '"+val6+"'");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}