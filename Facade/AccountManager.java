package aifanshahran.lab5b.facade;

public class AccountManager {

    public static void main(String[] args) {

        System.out.println("First Customer:");
        Account acc = new Account("John", "Smith");
        Address add = new Address("101 Jalan Bukit", "Shah Alam", "Selangor");
        CreditCard cc = new CreditCard("Visa", "1111222233334444", "01/09/2020");
        CustomerFacade cf = new CustomerFacade(acc, add, cc);
        cf.printOutput();

        System.out.println("\nSecond Customer:");
        acc = new Account("Vijaya", "K");
        add = new Address("1 Jalan University", "Kuala Lumpur", "Wilayah Persekutuan");
        cc = new CreditCard("Master", "9999888877776666", "01/01/2022");
        cf = new CustomerFacade(acc, add, cc);
        cf.printOutput();

        System.out.println("\nThird Customer");
        acc = new Account("Aryati", "Ahmad");
        add = new Address("35 Wisma Jaya", "Petaling Jaya", "Selangor");
        cc = new CreditCard("Master", "555566667777", "01/05/2023");
        cf = new CustomerFacade(acc, add, cc);
        cf.printOutput();
    }

}

