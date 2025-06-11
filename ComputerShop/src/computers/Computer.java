package computers;
import java.util.UUID;

public class Computer {

    /*
    Create a computers package and create the Computer class (according to description)
    Create getters and setters for each field of the class (all properties are private).
    Add a toString() method to the class, which returns the computer's properties as a string.
    What other properties could be relevant for the computer shop? Feel free to add them.
    Create a ComputerTest class that creates the computer object and prints its properties on the console.
     */

    /*
    Model and write a class Computer for a computer shop. The shop wants to keep track of its inventory.
    The following properties are important to the shop:
        Manufacturer name
        Processor speed in MHz
        RAM size in gigabytes
        Hard drive size in gigabytes
        Number of USB ports
        Screen size in inches (if available)
        Computer type (e.g., desktop computer, laptop)
        Preinstalled operating system: Yes/No
     */






    private String manufacturerName;
    private int processorSpeedMHZ;
    private int ramSizeGB;
    private int hddSizeGB;
    private int usbPorts;
    private int screenSizeInch;
    private String computerType;
    private Boolean preInstalledOS;
    private final String uniqueID;

    // new variables
    private double purchasePrice;
    private double sellingPrice;



    // Generate unique ID (shortened UUID) for serial number
    private static String generateUniqueID() {
        return UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

    //
    public String getUniqueID() {
        return uniqueID;
    }

    // TODO: The computer should have three constructors:
    // 1) a default constructor
    public Computer() {
        this.uniqueID = generateUniqueID();
    }

    // 2) a constructor with the minimum values of manufacturer name, screen size,
    //    and preinstalled operating system
    public Computer(String manufacturerName, int screenSizeInch, Boolean preInstalledOS, String uniqueID) {
        this.manufacturerName = manufacturerName;
        this.screenSizeInch = screenSizeInch;
        this.preInstalledOS = preInstalledOS;
        this.uniqueID = uniqueID;
        String uniqueID1 = generateUniqueID();
    }

    // 3) a constructor requiring all values
    public Computer(String manufacturerName, int processorSpeedMHZ, int ramSizeGB, int hddSizeGB,
                    int usbPorts, int screenSizeInch, String computerType, Boolean preInstalledOS,
                    double purchasePrice, double sellingPrice) {
        this.manufacturerName = manufacturerName;
        this.processorSpeedMHZ = processorSpeedMHZ;
        this.ramSizeGB = ramSizeGB;
        this.hddSizeGB = hddSizeGB;
        this.usbPorts = usbPorts;
        this.screenSizeInch = screenSizeInch;
        this.computerType = computerType;
        this.preInstalledOS = preInstalledOS;
        this.uniqueID = generateUniqueID();
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    //Create getters and setters for each field of the class (all properties are private)
    public String getManufacturerName() {
        return manufacturerName;
    }
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    public int getProcessorSpeedMHZ() {
        return processorSpeedMHZ;
    }
    public void setProcessorSpeedMHZ(int processorSpeedMHZ) {
        this.processorSpeedMHZ = processorSpeedMHZ;
    }
    public int getRamSizeGB() {
        return ramSizeGB;
    }
    public void setRamSizeGB(int ramSizeGB) {
        this.ramSizeGB = ramSizeGB;
    }
    public int getHddSizeGB() {
        return hddSizeGB;
    }
    public void setHddSizeGB(int hddSizeGB) {
        this.hddSizeGB = hddSizeGB;
    }
    public int getUsbPorts() {
        return usbPorts;
    }
    public void setUsbPorts(int usbPorts) {
        this.usbPorts = usbPorts;
    }
    public int getScreenSizeInch() {
        return screenSizeInch;
    }
    public void setScreenSizeInch(int screenSizeInch) {
        this.screenSizeInch = screenSizeInch;
    }
    public String getComputerType() {
        return computerType;
    }
    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }
    public Boolean getPreInstalledOS() {
        return preInstalledOS;
    }
    public void setPreInstalledOS(Boolean preInstalledOS) {
        this.preInstalledOS = preInstalledOS;
    }


    // getters and setters for purchase and selling price
    public double getPurchasePrice() {
        return purchasePrice;
    }
    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    public double getSellingPrice() {
        return sellingPrice;
    }


    // an additional method for the profit
    public double calculateProfit() {
        return getSellingPrice() - getPurchasePrice();
    }



    //Add a toString() method to the class, which returns the computer's properties as a string.
    //TODO: Question:  What happens if I don't add @Override?
    @Override
    public String toString() {
        return "Computer { " +
                "manufacturers name = '" + manufacturerName + '\'' +
                ", processor Speed in MHz=" + processorSpeedMHZ +
                ", ram size = " + ramSizeGB + " GBs"+ "\n"+
                ", HDD size = " + hddSizeGB + " GBs"+
                ", usb ports = " + usbPorts +
                ", screen Size " + screenSizeInch + " inches"+
                ", computer type = '" + computerType + '\'' + "\n"+
                ", preInstalled OS: " + preInstalledOS +
                ", purchase price: " + purchasePrice + " €"+
                ", selling price: " + sellingPrice + " € ,"+
                "serial number: " + getUniqueID() + " "+
                '}';
    }



}

