package Controller;

import java.sql.ResultSet;
import java.sql.Statement;

/* @author KALPANA DESHAN*/
public class DBSearch {
    Statement stmt;
    ResultSet rs;
    
    //My Booking Search - Litro
    public ResultSet searchMyBookingsLitro(String val1){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT CLiId, CLiName, CLiDeliveryAddress, CLi2Kg, CLi5Kg, CLi12_5Kg FROM customer_litro WHERE CLiNic like '%"+val1+"%'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    //My Booking Search - Laugfs
    public ResultSet searchMyBookingsLaugfs(String val2){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT CLaId, CLaName, CLaDeliveryAddress, CLa2Kg, CLa5Kg, CLa12_5Kg FROM customer_laugfs WHERE CLaNic like '%"+val2+"%'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    //Booking List - Litro
    public ResultSet searchLitroAll(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT CLiName, CliCity, CLi2Kg, CLi5Kg, CLi12_5Kg, CLiStatus FROM customer_litro WHERE CLiStatus IN('Booked', 'Pending List')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    //Booking List - Laugfs
    public ResultSet searchLaugfsAll(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT CLaName, ClaCity, CLa2Kg, CLa5Kg, CLa12_5Kg, CLaStatus FROM customer_laugfs WHERE CLaStatus IN('Booked', 'Pending List')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }

    //Available Cylinders - Litro
    public ResultSet searchLitroStock(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM gas WHERE GName='LITRO Gas'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    //Available Cylinders - Laugfs
    public ResultSet searchLaugfsStock(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM gas WHERE GName='LAUGFS Gas'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    //Available Stock & Prices - Litro
    public ResultSet searchLitroSAndP2Kg(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM gas WHERE GName='LITRO Gas' AND CylinderNameAndType='Litro_2Kg Cylinder'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet searchLitroSAndP5Kg(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM gas WHERE GName='LITRO Gas' AND CylinderNameAndType='Litro_5Kg Cylinder'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet searchLitroSAndP12_5Kg(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM gas WHERE GName='LITRO Gas' AND CylinderNameAndType='Litro_12.5Kg Cylinder'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    //Available Stock & Prices - Laugfs
    public ResultSet searchLaugfsSAndP2Kg(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM gas WHERE GName='LAUGFS Gas' AND CylinderNameAndType='Laugfs_2Kg Cylinder'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet searchLaugfsSAndP5Kg(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM gas WHERE GName='LAUGFS Gas' AND CylinderNameAndType='Laugfs_5Kg Cylinder'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet searchLaugfsSAndP12_5Kg(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM gas WHERE GName='LAUGFS Gas' AND CylinderNameAndType='Laugfs_12.5Kg Cylinder'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    //My Booking Search - Litro
    public ResultSet srchMyBookingsLitro(String val3, String val4){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT CLiName, CLiCurrentAddress, CLiDeliveryAddress, CLiCity, CLiNic, CLiTelephone, CLi2Kg, CLi5Kg, CLi12_5Kg FROM customer_litro WHERE CLiNic like '%"+val3+"%' AND CLiId like '%"+val4+"%'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    //My Booking Search - Laugfs
    public ResultSet srchMyBookingsLaugfs(String val5, String val6){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT CLaName, CLaCurrentAddress, CLaDeliveryAddress, CLaCity, CLaNic, CLaTelephone, CLa2Kg, CLa5Kg, CLa12_5Kg FROM customer_laugfs WHERE CLaNic like '%"+val5+"%' AND CLaId like '%"+val6+"%'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
}
