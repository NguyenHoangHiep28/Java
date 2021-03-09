package Java1_16;

public class Cylinder extends Circle {
    //    private instance variable
    private double height;

    //    constructors
    public Cylinder() {
        super();
        this.height = 1.0;
        System.out.println("Constructed a Cylinder with Cylinder()");
    }

    public Cylinder(double height) {
        super();
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height)");
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius)");
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");
    }
//    getters and setters

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Returns the volume of this Cylinder
     */
    public double getVolume() {
        return getArea() * height; //use Circle's getArea()
    }

    /**
     * Returns a self-descriptive String
     */
    public String toString() {
        return "This is a Cylinder"; // to be refined later
    }
}
