package Try04;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){
        int age, personalAssets;
        String gender;
        String profession;
        Scanner customer = new Scanner(System.in);
        System.out.println("Welcome to Lifemaxi! \n" +
                "Please enter your age: ");
        age = customer.nextInt();
        System.out.println("Please enter your gender(M/F): ");
        gender = customer.next();
        if ((age>=16) && (age<60)) {
            System.out.println("Please enter your profession(Self-Employed / Professional): ");
            profession = customer.next();
            if ((age >= 16) && (age <= 25)) {
                System.out.println("Please enter your personal assets: ");
                personalAssets = customer.nextInt();
                if (personalAssets > 25000){
                    if (profession.equals("Self-Employed")){
                        System.out.println("Loan amount eligible: 10000");
                    }else if (profession.equals("Professional")){
                        System.out.println("Loan amount eligible: 15000");
                    }else {
                        System.out.println("Invalid profession entered!");
                    }
                }else {
                    System.out.println("Personal assets invalid!");
                }
            }
            if ((age >= 26) && (age <= 40)) {
                System.out.println("Please enter your personal assets: ");
                personalAssets = customer.nextInt();
                if (personalAssets > 40000){
                    if (gender.equals("M")){
                        System.out.println("Loan amount eligible: 25000");
                    }else if (gender.equals("F")){
                        System.out.println("Loan amount eligible: 30000");
                    }else {
                        System.out.println("Invalid gender entered!");
                    }
                }else {
                    System.out.println("Personal assets invalid!");
                }
            }
            if ((age >= 41) && (age <= 60)) {
                System.out.println("Please enter your personal assets: ");
                personalAssets = customer.nextInt();
                if (personalAssets > 50000) {
                    System.out.println("Loan amount eligible: 40000");
                } else {
                    System.out.println("Personal assets invalid!");
                }
            }
        }else if (age > 60){
            System.out.println("Please enter your personal assets: ");
            personalAssets = customer.nextInt();
            if (personalAssets>25000){
                float LaeSE = 35000-age*100;
                float LaeR = 25000 - age*100;
                System.out.println("Please enter your profession(Self-Employed / Retired): ");
                profession = customer.next();
                if (profession.equals("Self-Employed")){
                    System.out.printf("Loan amount eligible %.1f",LaeSE);
                } else if (profession.equals("Retired")){
                    System.out.printf("Loan amount eligible %.1f",LaeR);
                } else {
                    System.out.println("Invalid profession entered!");
                }
            }else {
                System.out.println("Invalid personal assets!");
            }
        }
        else {
            System.out.println("Invalid age entered!");
        }
    }
}
