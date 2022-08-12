package Controller;

/* @author KALPANA DESHAN*/
public class LitroMySearchBean {
    private int Litroid;
    private String Name;
    private String DeliveryAddress;
    private String Cli_2Kg;
    private String Cli_5Kg;
    private String Cli_12_5Kg;
    
    public LitroMySearchBean(int aLitroid, String aName, String aDeliveryAddress, String aCli_2Kg, String aCli_5Kg, String aCli_12_5Kg){
      this.Litroid = aLitroid;
      this.Name = aName;
      this.DeliveryAddress = aDeliveryAddress;
      this.Cli_2Kg = aCli_2Kg;
      this.Cli_5Kg = aCli_5Kg;
      this.Cli_12_5Kg = aCli_12_5Kg;
    }

    public int getLitroid() {
        return Litroid;
    }

    public void setLitroid(int Litroid) {
        this.Litroid = Litroid;
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

  
    public String getCli_2Kg() {
        return Cli_2Kg;
    }

    public void setCli_2Kg(String Cli_2Kg) {
        this.Cli_2Kg = Cli_2Kg;
    }

    
    public String getCli_5Kg() {
        return Cli_5Kg;
    }

    public void setCli_5Kg(String Cli_5Kg) {
        this.Cli_5Kg = Cli_5Kg;
    }

    
    public String getCli_12_5Kg() {
        return Cli_12_5Kg;
    }

    public void setCli_12_5Kg(String Cli_12_5Kg) {
        this.Cli_12_5Kg = Cli_12_5Kg;
    } 
}
