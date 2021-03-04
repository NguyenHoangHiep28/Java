public class ExampleCircle {
    private double radius;
    private String color;

    public ExampleCircle() {
        radius = 1.0;
        color = "red";
    }
    public ExampleCircle(double r){
        radius = r;
        color = "red";
    }
    public ExampleCircle(double r, String c){
        radius = r;
        color = c;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public  double getArea(){
        return radius*radius*Math.PI;
    }
}
