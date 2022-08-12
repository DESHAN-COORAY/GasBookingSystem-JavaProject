package Controller;

import java.sql.ResultSet;
import java.sql.Statement;

/** @author KALPANA DESHAN*/
public class AdminDBSearch {
    Statement stmt;
    ResultSet rs;
    
    //Booking List - Litro
    public ResultSet adminSearchLitroAll(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT CliId, CLiName, CliCity, CLi2Kg, CLi5Kg, CLi12_5Kg, CLiStatus FROM customer_litro");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    //Booking List - Laugfs
    public ResultSet adminSearchLaugfsAll(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT CLaId, CLaName, ClaCity, CLa2Kg, CLa5Kg, CLa12_5Kg, CLaStatus FROM customer_laugfs");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    
    //Booking List - Litro
    public ResultSet adminSrchLitroAll(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT CLiName, CliCity, CLi2Kg, CLi5Kg, CLi12_5Kg, CLiStatus FROM customer_litro");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    //Booking List - Laugfs
    public ResultSet adminSrchLaugfsAll(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT CLaName, ClaCity, CLa2Kg, CLa5Kg, CLa12_5Kg, CLaStatus FROM customer_laugfs");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    //Available Cylinders - Litro
    public ResultSet adminSearchLitroStock(){
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
    public ResultSet adminSearchLaugfsStock(){
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
    public ResultSet adminSearchLitroSAndP2Kg(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM gas WHERE GName='LITRO Gas' AND CylinderNameAndType='Litro_2Kg Cylinder'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet adminSearchLitroSAndP5Kg(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM gas WHERE GName='LITRO Gas' AND CylinderNameAndType='Litro_5Kg Cylinder'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet adminSearchLitroSAndP12_5Kg(){
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
    public ResultSet adminSearchLaugfsSAndP2Kg(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM gas WHERE GName='LAUGFS Gas' AND CylinderNameAndType='Laugfs_2Kg Cylinder'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet adminSearchLaugfsSAndP5Kg(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM gas WHERE GName='LAUGFS Gas' AND CylinderNameAndType='Laugfs_5Kg Cylinder'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet adminSearchLaugfsSAndP12_5Kg(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM gas WHERE GName='LAUGFS Gas' AND CylinderNameAndType='Laugfs_12.5Kg Cylinder'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    //Booking Search - Litro
    public ResultSet srchBookingsLitro(String val1){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT CLiStatus FROM customer_litro WHERE CLiId like '%"+val1+"%'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    //Booking Search - Laugfs
    public ResultSet srchBookingsLaugfs(String val2){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT CLaStatus FROM customer_laugfs WHERE CLaId like '%"+val2+"%'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
}
