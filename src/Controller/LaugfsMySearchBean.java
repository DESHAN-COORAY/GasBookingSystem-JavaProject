package Controller;

/*@author KALPANA DESHAN*/
public class LaugfsMySearchBean {
    private int Laugfsid;
    private String Name;
    private String DeliveryAddress;
    private String Cla_2Kg;
    private String Cla_5Kg;
    private String Cla_12_5Kg;
    
    public LaugfsMySearchBean(int bLaugfsid, String bName, String bDeliveryAddress, String bCla_2Kg, String bCla_5Kg, String bCla_12_5Kg){
      this.Laugfsid = bLaugfsid;
      this.Name = bName;
      this.DeliveryAddress = bDeliveryAddress;
      this.Cla_2Kg = bCla_2Kg;
      this.Cla_5Kg = bCla_5Kg;
      this.Cla_12_5Kg = bCla_12_5Kg;
    }

    public int getLaugfsid() {
        return Laugfsid;
    }

    public void setLaugfsid(int Laugfsid) {
        this.Laugfsid = Laugfsid;
    }

 
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    
    public String getDeliveryAddress() {
        return DeliveryAddress;
    }

    public void setDeliveryAddress(String DeliveryAddress) {
        this.DeliveryAddress = DeliveryAddress;
    }

  
    public String getCla_2Kg() {
        return Cla_2Kg;
    }

    public void setCla_2Kg(String Cla_2Kg) {
        this.Cla_2Kg = Cla_2Kg;
    }

    
    public String getCla_5Kg() {
        return Cla_5Kg;
    }

    public void setCla_5Kg(String Cla_5Kg) {
        this.Cla_5Kg = Cla_5Kg;
    }

    
    public String getCla_12_5Kg() {
        return Cla_12_5Kg;
    }

    public void setCla_12_5Kg(String Cla_12_5Kg) {
        this.Cla_12_5Kg = Cla_12_5Kg;
    } 
}
