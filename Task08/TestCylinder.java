package Java1_18;

public class TestCylinder {
    public static void main(String[] args){
        //Substitute a subclass instance to a super class reference
       Cylinder c1 = new Cylinder(1.1, 2.2);
        //Invoke super class Circle's methods
        System.out.println(c1.getRadius());
        System.out.println(c1.toString());
        System.out.println(c1.getArea());
        Circle C1 = new Circle(1.1);
        Cylinder cy1 = new Cylinder(2.2,3.3);
        System.out.println(C1 instanceof Circle);
        System.out.println(C1 instanceof Cylinder);
        System.out.println(cy1 instanceof Cylinder);
        System.out.println(cy1 instanceof Circle);
        Circle c2 = new Cylinder(4.4, 5.5);
        System.out.println(c2 instanceof Circle);
        System.out.println(c2 instanceof Cylinder);
    }
}
