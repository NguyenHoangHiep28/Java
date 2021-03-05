package Java1_11;

public class TestRectangle {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle length: " + r1.getLength());
        System.out.println("Rectangle width: " + r1.getWidth());
        System.out.printf("Rectangle Area: %.2f%n", r1.getArea());
        System.out.printf("Rectangle Perimeter: %.2f%n", r1.getPerimeter());
        System.out.println(r1.toString());
        System.out.println("\n********************************\n");
        r1.setLength(5);
        r1.setWidth(4);
        //after called setLength() and setWidth() methods
        System.out.println(r1.toString());
        System.out.printf("Rectangle Area: %.2f%n", r1.getArea());
        System.out.printf("Rectangle Perimeter: %.2f%n", r1.getPerimeter());
        //other instance
        System.out.println();
        Rectangle r2 = new Rectangle(5.5f, 4.5f);
        System.out.println("Rectangle length: " + r2.getLength());
        System.out.println("Rectangle width: " + r2.getWidth());
        System.out.printf("Rectangle Area: %.2f%n", r2.getArea());
        System.out.printf("Rectangle Perimeter: %.2f%n", r2.getPerimeter());
        System.out.println(r2.toString());
    }
}
