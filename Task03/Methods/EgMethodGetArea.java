package Methods;

public class EgMethodGetArea {
    public static void main(String[] args){
        double r = 1.1, area, area2;
        // Call (invoke) method getArea() and return
        area = getArea(r);
        System.out.println("Area is " + area);
        // Call method getArea() again and return
        area2 = getArea(2.2);
        System.out.println("Area 2 is " + area2);
        // Call method getArea() one more time and return
        System.out.println("Area 3 is " + getArea(3.3));
    }
    public static double getArea(double radius){
        return radius * radius * Math.PI;
    }
}
