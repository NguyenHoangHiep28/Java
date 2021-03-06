package Java1_11;

public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " +
                c1.getRadius() + " and area of " + c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " +
                c2.getRadius() + " and area of " + c2.getArea());
        Circle c3 = new Circle(3.0, "yellow");
        System.out.println("The circle has radius of " +
                c3.getRadius() + " and area of " + c3.getArea() +
                " with color : " + c3.getColor());
//        System.out.println(c1.radius);
        Circle c4 = new Circle();
        c4.setRadius(5.0);
        System.out.println("radius is: " + c4.getRadius());
        c4.setColor("green");
        System.out.println("color is: " + c4.getColor());
//        System.out.println(c4.setRadius(4.0));

        //toString() method

        System.out.println(c4.toString());//explicit call
        System.out.println(c3);//implicit call
        System.out.println("Operator '+' invokes toString() too:" +
                 c2);// use '+' operator
    }
}
