package Practice;

public class TestFlight {
    public static void main(String[] args){
        Flight f2 = new Flight();
        f2.display();
        System.out.println("--------------------------------");
        Flight f1 = new Flight(230, "Tokyo");
        f1.display();
    }
}
