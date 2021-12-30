package aifanshahran.lab5b.facade;

public class CreditCard {
    private String cardType;
    private String cardNumber;
    private String cardExpDate;
    final String CC_DATA_FILE = "CC.txt";
    public static final String VISA = "Visa";
    public static final String MASTER = "Master";

    public CreditCard(String cardType, String cardNumber, String cardExpDate) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cardExpDate = cardExpDate;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardExpDate() {
        return cardExpDate;
    }

    public boolean isValid(){
        return getCardNumber().trim().length() == 16;
    }

    public boolean save(){
        FileUtility futil = new FileUtility();
        String dataLine = getCardType()+","+getCardNumber()+","+getCardExpDate();
        return futil.writeToFile(CC_DATA_FILE, dataLine);
    }
}

