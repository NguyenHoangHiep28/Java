package session02;

import java.util.Scanner;
public class Account {
    public static void main(String[] args){
        double accountBalance = 10000.00;
        double withdraw = 0.00;
        boolean possible = false;
        String cusname;

        System.out.printf("Available account balance: $%.2f \n", accountBalance);
        System.out.println("Enter the Amount to withdraw: $");
        Scanner scan = new Scanner(System.in);
        withdraw = Double.parseDouble(scan.nextLine());
        System.out.println("Enter the customer Name: ");
        cusname = scan.nextLine();

        possible = (accountBalance > withdraw);
        accountBalance = possible ? accountBalance - withdraw : accountBalance;
        System.out.println("Welcome " + cusname);
        System.out.printf("\nCurrent account balance: $%.2f", accountBalance);
        System.out.println("\nTransaction Successful: " + possible);
    }
}
