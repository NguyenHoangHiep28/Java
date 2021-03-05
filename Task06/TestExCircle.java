package Java1_11;

public class TestExCircle {
    public static void main(String[] args){
        ExCircle exc1 = new ExCircle();
        System.out.println("Circle radius: " + exc1.getRadius());
        System.out.printf("Circle Area: %.2f%n", exc1.getArea());
        System.out.printf("Circle Circumference: %.2f%n", exc1.getCircumference());
        System.out.println(exc1.toString());
        System.out.println();
        ExCircle exc2 = new ExCircle(4.5);
        System.out.println("Circle radius: " + exc2.getRadius());
        System.out.printf("Circle Area: %.2f%n", exc2.getArea());
        System.out.printf("Circle Circumference: %.2f%n", exc2.getCircumference());
        System.out.println(exc2.toString());
    }
}
