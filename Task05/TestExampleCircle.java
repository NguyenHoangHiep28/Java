public class TestExampleCircle {
    public static void main(String[] args){
        // Declare and Construct instace of the ExampleCircle class called c1
        ExampleCircle c1 = new ExampleCircle(2.0, "blue"); // 3rd constructor
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The color is: " + c1.getColor());
        System.out.printf("The area is: %.2f%n", c1.getArea());
        //Declare and Construct another instace of the ExampleCircle class called c2
        ExampleCircle c2 = new ExampleCircle(2.0); //2nd constructor
        System.out.println("The radius is: " + c2.getRadius());
        System.out.println("The color is: " + c2.getColor());
        System.out.printf("The area is: %.2f%n", c2.getArea());
        //Declare and Construct yet another instance of the ExampleCircle called c3
        ExampleCircle c3 = new ExampleCircle();//1st constructor
        System.out.println("The radius is: " + c3.getRadius());
        System.out.println("The color is: " + c3.getColor());
        System.out.printf("The area is: %.2f%n", c3.getArea());
    }
}
