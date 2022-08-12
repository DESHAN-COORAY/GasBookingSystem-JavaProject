package Controller;

import javax.swing.JOptionPane;

/** @author KALPANA DESHAN*/
public class AdminController {
    
    //Update Gas Details - Litro  
    public static void gasDetailsUpdateLitro2Kg(String AvailableStock, String Price) {
            new AdminUpdate().gasDetailsUpdateLitro2Kg(AvailableStock, Price);
        JOptionPane.showMessageDialog(null, "Gas Details has been updated", "UPDATE SUCCESSFULL", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void gasDetailsUpdateLitro5Kg(String AvailableStock, String Price) {
            new AdminUpdate().gasDetailsUpdateLitro5Kg(AvailableStock, Price);
        JOptionPane.showMessageDialog(null, "Gas Details has been updated", "UPDATE SUCCESSFULL", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void gasDetailsUpdateLitro12Kg(String AvailableStock, String Price) {
            new AdminUpdate().gasDetailsUpdateLitro12Kg(AvailableStock, Price);
        JOptionPane.showMessageDialog(null, "Gas Details has been updated", "UPDATE SUCCESSFULL", JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Update Gas Details - Laugfs 
    public static void gasDetailsUpdateLaugfs2Kg(String AvailableStock, String Price) {
            new AdminUpdate().gasDetailsUpdateLaugfs2Kg(AvailableStock, Price);
        JOptionPane.showMessageDialog(null, "Gas Details has been updated", "UPDATE SUCCESSFULL", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void gasDetailsUpdateLaugfs5Kg(String AvailableStock, String Price) {
            new AdminUpdate().gasDetailsUpdateLaugfs5Kg(AvailableStock, Price);
        JOptionPane.showMessageDialog(null, "Gas Details has been updated", "UPDATE SUCCESSFULL", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void gasDetailsUpdateLaugfs12Kg(String AvailableStock, String Price) {
            new AdminUpdate().gasDetailsUpdateLaugfs12Kg(AvailableStock, Price);
        JOptionPane.showMessageDialog(null, "Gas Details has been updated", "UPDATE SUCCESSFULL", JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Update Status - Litro   
    public static void BookingUpdateLitro(String CLiStatus, String val1) {
            new AdminUpdate().BookingUpdateLitro(CLiStatus, val1);
        JOptionPane.showMessageDialog(null, "Booking has been updated", "UPDATE SUCCESSFULL", JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Update Status - Litro  
    public static void BookingUpdateLaugfs(String CLaStatus, String val2) {
            new AdminUpdate().BookingUpdateLaugfs(CLaStatus, val2);
        JOptionPane.showMessageDialog(null, "Booking has been updated", "UPDATE SUCCESSFULL", JOptionPane.INFORMATION_MESSAGE);
    }
}
