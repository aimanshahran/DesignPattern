package aifanshahran.lab5a.class_adapters_p2;

import java.util.Scanner;

public class AddressClassAdapterTest {

    public static void main(String[] args) {
        String name, address, zip, state, AddressType;
        int ChoiceAddressType;
        AddressType = "US";
        Scanner data = new Scanner (System.in);
        System.out.print("Customer Name: ");
        name = data.nextLine();
        System.out.print("Address: ");
        address = data.nextLine();
        System.out.print("Zip/PostalCode: ");
        zip = data.nextLine();
        System.out.print("State/Province: ");
        state = data.nextLine();
        System.out.print("Please choose your address type:\n1. US \n2. CA\nAddress Type: ");
           ChoiceAddressType = data.nextInt();
           if(ChoiceAddressType==1)
               AddressType = "US";
           if(ChoiceAddressType==2)
               AddressType = "Canada";
    Customer customer = new Customer(name, address, zip, state, AddressType);
    if(customer.isValidAddress()){
            System.out.println("Result: Valid customer data");
        }
        else{
            System.out.println("Result: Invalid customer data");
     }
    }
    
}
