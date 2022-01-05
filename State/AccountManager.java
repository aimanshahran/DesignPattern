package aifanshahran.state;

import java.util.Scanner;

public class AccountManager {
    public static void main(String[] args) {
        double amount;
        int option;
        Scanner scanner = new Scanner(System.in);

        String accountNumber = " 1111 2222 3333 4444";
        BusinessAccount businessAccount = new BusinessAccount(accountNumber);
        do {
            System.out.print("Enter 1 to display account, 2 to deposit, 3 to "
                    + "withdraw, 0 to exit: ");
            option = scanner.nextInt();

            switch (option) {
                case 0:
                    System.out.println("exited");
                    break;
                case 1:
                    businessAccount.displayAccount();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextDouble();
                    businessAccount.deposit(amount);
                    businessAccount.displayAccount();
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    businessAccount.withdraw(amount);
                    businessAccount.displayAccount();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");
                    break;
            }
        } while (option != 0);
    }
}
