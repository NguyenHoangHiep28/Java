package Methods;

public class AverageMethodOverloading {
    public static void main(String[] args){
        System.out.println(average(8, 6));
        System.out.println(average(8,6,9));
        System.out.println(average(8.1,6.1));
        System.out.println(average(8, 6.1));

    }
    //version 1 takes 2 int's
    public static int average(int n1, int n2){
        System.out.println("Version 1");
        return (n1 + n2) / 2; // int
    }
    //version 2 takes 3 int's
    public static int average(int n1, int n2, int n3){
        System.out.println("Version 2");
        return (n1 + n2 + n3) / 3; // int
    }
    //version 3 takes 2 doubles
    public static double average(double n1, double n2){
        System.out.println("Version 3");
        return (n1 + n2)/ 2.0;
    }
}
