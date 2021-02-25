package Try03;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){
        int accountBalance, withDraw;
        boolean possible;
        //int 1account; (invalid variable name)
        accountBalance = 5000;
        Scanner account = new Scanner(System.in);
        System.out.println("Welcome to the ATM, please enter your name: ");
        String name = account.nextLine();
        System.out.println("Welcome " + name + ". Your account balance is: "
                + accountBalance +"$"+"\nPlease enter the wanted withdraw amount of money: ");
        withDraw = account.nextInt();
        possible = (accountBalance >= withDraw);
        accountBalance = possible ? accountBalance - withDraw : accountBalance;
        if (possible){
            System.out.printf("Withdraw successfully! Please wait to take your money!\nYour account balance now is :  %d$", accountBalance);
        }else {
            System.out.printf("Withdraw failed! \nYour account balance is %d$", accountBalance);
        }

    }
}
