public class TestCar {
    public static void main(String[] args){
        Car c1 = new Car("51F-178.12", 120, 100, 70.5);
        System.out.println(c1.plateNumber + " | XLocation: " + c1.XLocation +
                " | YLocation: " + c1.YLocation + " | Speed: " + c1.speed +
                c1.move());
        Car c2 = new Car("51F-120.31");
        System.out.println(c2.plateNumber + " | XLocation: " + c2.XLocation +
                " | YLocation: " + c2.YLocation + " | Speed: " + c2.speed +
                c2.park());
        Car c3 = new Car("41F-098.10", 135, 110, 65.4);
        System.out.println(c3.plateNumber + " | XLocation: " + c3.XLocation +
                " | YLocation: " + c3.YLocation + " | Speed: " + c3.speed +
                c3.accelerate());
    }
}
