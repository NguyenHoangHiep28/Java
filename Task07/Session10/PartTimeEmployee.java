package Session10;

public class PartTimeEmployee extends Employee{
    //Subclass specific variable
    String shift;//Variable to store shift information

    /**
     * Parameterized constructor to initialize values based on user input
     *
     * @param id a String variable storing employee ID
     * @param name a String variable storing employee name
     * @param sal an integer variable storing salary
     * @param shift a String variable storing shift information
     */
    public PartTimeEmployee(String id, String name, int sal, String shift){
        //Invoke the super class constructor
        super(id, name, sal);
        this.shift = shift;
    }

    /**
     * Overridden method to display employee details
     *
     * @return void
     */
    @Override
    public void displayDetails(){
        calcCommission(12);//Invoke the inherited method
        super.displayDetails();
        System.out.println("Working shift: " + shift);
    }



}
