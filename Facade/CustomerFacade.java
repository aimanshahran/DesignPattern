package aifanshahran.lab5b.facade;

public class CustomerFacade {

    private Account account;
    private Address address;
    private CreditCard creditCard;

    public CustomerFacade(Account acc, Address add, CreditCard cc) {
        this.account = acc;
        this.address = add;
        this.creditCard = cc;
    }

    public void printOutput(){
        boolean nameValid = account.isValid();
        boolean addressValid = address.isValid();
        boolean ccValid = creditCard.isValid();
        System.out.println("First name = "+account.getFirstName()+", Last Name = "+account.getLastName());
        System.out.println("Address = "+address.getAddress()+", City = "+address.getCity()+", State = "+address.getState());
        System.out.println("Card type = "+creditCard.getCardType()+", Card Number = "+creditCard.getCardNumber()+", Card expiry date = "+creditCard.getCardExpDate());

        if (nameValid) {
            System.out.println("Valid FirstName/LastName");
        } else {
            System.out.println("Invalid FirstName/LastName");
        }

        if (addressValid) {
            System.out.println("Valid Address/City/State");
        } else {
            System.out.println("Invalid Address/City/State");
        }

        if (ccValid) {
            System.out.println("Valid CreditCard");
        } else {
            System.out.println("Invalid CreditCard");
        }

        if (nameValid&&addressValid&&ccValid) {
            account.save();
            address.save();
            creditCard.save();
            System.out.println("==>Valid Customer Data: Data Saved Successfully");
        } else {
            System.out.println("==>Invalid Customer Data: Data Could Not Be Saved");
        }
    }
}
