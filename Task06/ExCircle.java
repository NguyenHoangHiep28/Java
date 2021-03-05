package Java1_11;

public class ExCircle {
    private double radius;
    public ExCircle(){
        radius = 1.0;
    }
    public ExCircle(double radius){
        this.radius = radius;
    }
    //methods
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "Circle[radius = " + radius + "]";
    }
}
