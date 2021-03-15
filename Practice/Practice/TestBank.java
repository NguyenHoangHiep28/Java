package Practice;

public class TestBank {
    public static void main(String[] args){
        //instances
        Bank acc1 = new Bank(1500, 12);
        System.out.println("Borrowed money: $" + acc1.getBalance());
        System.out.printf("Annual interest rate: %.0f%%%n", acc1.getRate());
        System.out.printf("Monthly interest: $%.1f%n", acc1.calculateInterest());
        System.out.println("----------------------------");
        Bank acc2 = new Bank(1250, 5);
        System.out.println("Borrowed money: $" + acc2.getBalance());
        System.out.printf("Annual interest rate: %.0f%%%n", acc2.getRate());
        System.out.printf("Monthly interest: $%.1f%n", acc2.calculateInterest());
    }
}
