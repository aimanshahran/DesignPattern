package aifanshahran.lab5b.facade;

public class Account {
    private String firstName;
    private String lastName;
    final String ACCOUNT_DATA_FILE = "AccountData.txt";

    public Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isValid(){
        return getLastName().trim().length() >= 2;
    }

    public boolean save(){
        FileUtility futil = new FileUtility();
        String dataLine = getLastName()+","+getFirstName();
        return futil.writeToFile(ACCOUNT_DATA_FILE, dataLine);
    }
}
