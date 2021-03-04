public class Circle {
    private double radius;
    public Circle(){    // 1st Constructor
        radius = 1.0;
    }
    public Circle(double radius){    // 2nd Constructor
        this.radius = radius;
    }
    // Public methods
    public  double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
