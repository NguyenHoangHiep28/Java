package Try04;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args){
        int deposit;
        double interest;
        Scanner depAmount = new Scanner(System.in);
        System.out.println("Enter your deposit amount: ");
        deposit = depAmount.nextInt();
        if ((deposit>0)&&(deposit<=2000)){
            interest = (double) deposit*4/100;
            System.out.println("Your interest earned in a year is: " + interest);
        }else if ((deposit>2000)&&(deposit<=7000)){
            interest = (double) (deposit*4.5/100);
            System.out.println("Your interest earned in a year is: " + interest);
        }else if ((deposit>7000)) {
            interest = (double) (deposit * 4 / 100);
            System.out.println("Your interest earned in a year is: " + interest);
        }
    }
}
