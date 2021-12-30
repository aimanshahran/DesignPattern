package aifanshahran.lab5b.facade;

public class Address {
    private String address;
    private String city;
    private String state;
    final String ADDRESS_DATA_FILE = "AddressData.txt";

    public Address(String address, String city, String state) {
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public boolean isValid(){
        return getState().trim().length()>=2;
    }

    public boolean save(){
        FileUtility futil = new FileUtility();
        String dataLine = getAddress()+","+getCity()+","+getState();
        return futil.writeToFile(ADDRESS_DATA_FILE, dataLine);
    }
}
