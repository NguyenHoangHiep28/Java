package Java1_11;

public class Account {
    private String id, name;
    private int balance;
    public Account(String id, String name){
        this.id = id;
        this.name = name;
        balance = 0;
    }
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        balance = balance + amount;
        return balance;
    }
    public int debit(int amount){
        if (amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Amount exceeded");
        }
        return balance;
    }
    public int transferTo(Account another, int amount){
        if (amount <= balance){
            another.balance += amount;
            balance -= amount;
        }else {
            System.out.println("Amount exceeded");
        }
        return balance;
    }
    public String toString(){
        return "Account[id="+id+",name="+name+",balance="
                +balance+"]";
    }
}
