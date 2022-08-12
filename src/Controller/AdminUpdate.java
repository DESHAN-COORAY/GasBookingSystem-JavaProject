package Controller;

import java.sql.Statement;

/** @author KALPANA DESHAN*/
public class AdminUpdate {
    Statement stmt;
    
    //Update Query Litro 2Kg
    public void gasDetailsUpdateLitro2Kg(String AvailableStock, String Price) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE gas SET AvailableStock = '"+AvailableStock+"', Price = '"+Price+"' WHERE Gid = 'Litro02Kg'");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Update Query Litro 5Kg
    public void gasDetailsUpdateLitro5Kg(String AvailableStock, String Price) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE gas SET AvailableStock = '"+AvailableStock+"', Price = '"+Price+"' WHERE Gid = 'Litro05Kg'");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Update Query Litro 12.5Kg
    public void gasDetailsUpdateLitro12Kg(String AvailableStock, String Price) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE gas SET AvailableStock = '"+AvailableStock+"', Price = '"+Price+"' WHERE Gid = 'Litro12_5Kg'");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    //Update Query Laugfs 2Kg
    public void gasDetailsUpdateLaugfs2Kg(String AvailableStock, String Price) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE gas SET AvailableStock = '"+AvailableStock+"', Price = '"+Price+"' WHERE Gid = 'Laugfs02Kg'");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Update Query Laugfs 5Kg
    public void gasDetailsUpdateLaugfs5Kg(String AvailableStock, String Price) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE gas SET AvailableStock = '"+AvailableStock+"', Price = '"+Price+"' WHERE Gid = 'Laugfs05Kg'");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Update Query Laugfs 12.5Kg
    public void gasDetailsUpdateLaugfs12Kg(String AvailableStock, String Price) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE gas SET AvailableStock = '"+AvailableStock+"', Price = '"+Price+"' WHERE Gid = 'Laugfs12_5Kg'");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //Update Query - Booking Status Litro
    public void BookingUpdateLitro(String CLiStatus, String val1) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE customer_litro SET CLiStatus = '"+CLiStatus+"' WHERE CLiId = '"+val1+"'");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //Update Query - Booking Status Litro
    public void BookingUpdateLaugfs(String CLaStatus, String val2) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE customer_laugfs SET CLaStatus = '"+CLaStatus+"' WHERE CLaId = '"+val2+"'");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
