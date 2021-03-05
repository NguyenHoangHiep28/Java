package Java1_11;

public class TestAccount {
    public static void main(String[] args){
        Account a1 = new Account("A01", "John");//1st constructor
        Account a2 = new Account("A02", "Mike", 250);//2nd constructor
        System.out.println("Account ID: " + a1.getID());
        System.out.println("Account name: "+ a1.getName());
        System.out.println("Account balance(a1): " + a1.getBalance());
        //toString() method
        System.out.println(a1);
        //credit() and debit() methods
        System.out.println("Credit - Account balance: " + a1.credit(500) + "$");
        System.out.println("Debit - Account balance: " + a1.debit(700) +"$");
        System.out.println(a1.getID()+ " Account balance before transfering: " + a1.getBalance() +"$");
        System.out.println(a2.getID()+ " Account balance before transfered : " + a2.getBalance() +"$");
        System.out.println("Transfering - Account balance" + "(" +a1.getID()+") : " + a1.transferTo(a2, 250)+"$");
        System.out.println("Transfered - Account balance" + "(" +a2.getID()+") : "+ a2.getBalance()+"$");
        System.out.println(a2);
    }
}
