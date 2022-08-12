package Controller;

import javax.swing.JOptionPane;

/* @author KALPANA DESHAN*/
public class BookingController {
    
//Insert
    public static void GasBookingLitro(String CLiName, String CLiCurrentAddress, String CLiDelivaryAddress, String CLiCity, String CLiNic, String CLiTelephone, String CLi2Kg, String CLi5Kg, String CLi12_5Kg, String CLiStatus) {
            new BookingAdd().GasBookingLitro(CLiName, CLiCurrentAddress, CLiDelivaryAddress, CLiCity, CLiNic, CLiTelephone, CLi2Kg, CLi5Kg, CLi12_5Kg, CLiStatus);
    }
    
    public static void GasBookingLaugfs(String CLaName, String CLaCurrentAddress, String CLaDelivaryAddress, String CLaCity, String CLaNic, String CLaTelephone, String CLa2Kg, String CLa5Kg, String CLa12_5Kg, String CLaStatus) {
            new BookingAdd().GasBookingLaugfs(CLaName, CLaCurrentAddress, CLaDelivaryAddress, CLaCity, CLaNic, CLaTelephone, CLa2Kg, CLa5Kg, CLa12_5Kg, CLaStatus);
        //JOptionPane.showMessageDialog(null, "New Booking has been inserted", "BOOKING SUCCESSFULL", JOptionPane.INFORMATION_MESSAGE);
    }
    
//Update    
    public static void GasBookingUpdateLitro(String CLiName, String CLiCurrentAddress, String CLiDelivaryAddress, String CLiCity, String CLiNic, String CLiTelephone, String CLi2Kg, String CLi5Kg, String CLi12_5Kg, String val3, String val4) {
            new BookingUpdate().GasBookingUpdateLitro(CLiName, CLiCurrentAddress, CLiDelivaryAddress, CLiCity, CLiNic, CLiTelephone, CLi2Kg, CLi5Kg, CLi12_5Kg, val3, val4);
        JOptionPane.showMessageDialog(null, "Booking has been updated", "UPDATE SUCCESSFULL", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void GasBookingUpdateLaugfs(String CLaName, String CLaCurrentAddress, String CLaDelivaryAddress, String CLaCity, String CLaNic, String CLaTelephone, String CLa2Kg, String CLa5Kg, String CLa12_5Kg, String val5, String val6) {
            new BookingUpdate().GasBookingUpdateLaugfs(CLaName, CLaCurrentAddress, CLaDelivaryAddress, CLaCity, CLaNic, CLaTelephone, CLa2Kg, CLa5Kg, CLa12_5Kg, val5, val6);
        JOptionPane.showMessageDialog(null, "Booking has been updated", "UPDATE SUCCESSFULL", JOptionPane.INFORMATION_MESSAGE);
    }
    
//Delete
    public static void GasBookingDeleteLitro(String val4) {
            new BookingDelete().GasBookingDeleteLitro(val4);
        JOptionPane.showMessageDialog(null, "Booking has been deleted", "DELETE SUCCESSFULL", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void GasBookingDeleteLaugfs(String val6) {
            new BookingDelete().GasBookingDeleteLaugfs(val6);
        JOptionPane.showMessageDialog(null, "Booking has been deleted", "DELETE SUCCESSFULL", JOptionPane.INFORMATION_MESSAGE);
    }
}