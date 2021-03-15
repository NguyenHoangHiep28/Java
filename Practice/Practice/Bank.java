package Practice;

public class Bank {
    //instance variables
    private double balance, rate;

    //Constructors
    public Bank() {
        balance = 0;
        rate = 0;
    }

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    //Methods

    public double getBalance() {
        return balance;
    }

    public double getRate() {
        return rate;
    }

    public double calculateInterest() {
        double interest = balance * (rate / 1200);
        return interest;
    }
}
