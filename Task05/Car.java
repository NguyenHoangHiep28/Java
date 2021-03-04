public class Car {
    public String plateNumber;
    public int XLocation, YLocation;
    public double speed;

    public Car(String plateNumber, int XLocation, int YLocation, double speed){
        this.plateNumber = plateNumber;
        this.XLocation = XLocation;
        this.YLocation = YLocation;
        this.speed = speed;
    }
    public Car(String plateNumber){
        this.plateNumber = plateNumber;
        this.XLocation = 0;
        this.YLocation = 0;
        this.speed = 0;
    }

    public String move(){
        return " | move : moving";
    }
    public String park(){
        return " | park : parking";
    }
    public String accelerate(){
        return " | accelerate : yes";
    }
}
