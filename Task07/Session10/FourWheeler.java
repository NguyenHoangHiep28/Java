package Session10;

public class FourWheeler extends Vehicle{
    //Declare a field specific to child class
    private boolean powerSteer;//Variable to store steering information
    /**
     * Parameterized constructor to initialized values based on user input
     *
     * @param vId a String variable storing vehicle
     * @param vName a String variable storing vehicle name
     * @param numWheels an integer variable storing number of wheels
     * @param pSteer a String variable storing steering information
     */
    public FourWheeler(String vId, String vName, int numWheels, boolean pSteer){
        //Attributes inherited from parent class
       super(vId, vName, numWheels);
        //Child class' own attribute
        powerSteer = pSteer;
    }

    /**
     * Displays vehicle details
     *
     * @return void
     */
    public void showDetails(){
        System.out.println("Vehicle no: " + vehicleNo);
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Number of Wheels: " + wheels);

        if (powerSteer == true)
            System.out.println("Power Steering: Yes");
        else
            System.out.println("Power Steering: No");
    }

    /**
     * Overridden method
     * Accelerates the vehicle
     *
     * @return void
     */
    @Override
    public void accelerate(int speed) {
        System.out.println("Maximum acceleration: "+speed+"kmph");
    }
}
