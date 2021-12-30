package aifanshahran.lab7.templatemethod;

public class Client {
    public static void main(String[] args) {
        //TEST INVALID
        String num = "1234123412341234";
        int expMonth = 11;
        int expYear = 2004;
        CreditCard cc = new VisaCard(num, expMonth, expYear);
        System.out.println("Card type = "+ cc.getClass().getSimpleName() + 
                ", Card number = " + num + ", Expiry month = " + expMonth + 
                ", Expired year = " + expYear);
        if (cc.isValid())
            System.out.println("This credit card is valid");
        else
            System.out.println("This credit card is invalid");
        
        //TEST VALID
        String num1 = "30263720264678";
        int expMonth1 = 5;
        int expYear1 = 2025;
        CreditCard cc1 = new DinersCard(num1, expMonth1, expYear1);
        System.out.println("\nCard type = "+ cc1.getClass().getSimpleName() + 
                ", Card number = " + num1 + ", Expiry month = " + expMonth1 + 
                ", Expired year = " + expYear1);
        if (cc1.isValid())
            System.out.println("This credit card is valid");
        else
            System.out.println("This credit card is invalid");
    } 
}


