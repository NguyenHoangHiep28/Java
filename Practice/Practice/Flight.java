package Practice;

public class Flight {

    //instances variables
    private int number;
    private String destination;

    //Constructors
    public Flight() {
        number = 0;
        destination = null;
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }
    //Methods

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public void display() {
        System.out.println(number + ", " + destination);
    }
}
