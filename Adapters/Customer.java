package aifanshahran.lab5a.class_adapters_p2;

public class Customer {
    public static final String US = "US";
    public static final String CANADA= "Canada";
    private String address;

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }

    public String getType() {
        return type;
    }
    private String name;
    private String zip, state, type;

    public Customer(String address, String name, String zip, String state, String type) {
        this.address = address;
        this.name = name;
        this.zip = zip;
        this.state = state;
        this.type = type;
    }

    public boolean isValidAddress(){
        AddressValidator validator = getValidator(type);
        return validator.isValidAddress(address, zip, state);
    }

    private AddressValidator getValidator (String custType){
        AddressValidator validator = null;
        if(custType.equals(Customer.US)){
            validator = new USAddress();
        }
        else if(custType.equals(Customer.CANADA)){
            validator = new CAAddressAdapter();
        }
        return validator;
    }
}
