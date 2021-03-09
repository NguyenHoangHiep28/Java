package Session10;

public class TestVehicle {
    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args){
        //Create an object of child class and specify the values
        FourWheeler objFour = new FourWheeler("La-09cs-1406", "Volkswagen", 4, true);
        objFour.showDetails();//Invoke the child class method
        objFour.accelerate(200);//Invoke the inherited method
    }
}
