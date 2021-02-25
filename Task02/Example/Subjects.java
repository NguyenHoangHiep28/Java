package session01;
import java.util.Scanner;
public class Subjects {
    public static void main(String[] args){
        float Maths, Physics, Chemistry, Avg;
        Scanner Student = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = Student.nextLine();
        System.out.println("Enter Maths grade: ");
        Maths = Student.nextFloat();
        System.out.println("Enter Physics grade: ");
        Physics = Student.nextFloat();
        System.out.println("Enter Chemistry grade: ");
        Chemistry = Student.nextFloat();
        Avg = (Maths + Physics + Chemistry) / 3;
        System.out.println("Student's name: " + name);
        System.out.println("Maths grade: " + Maths);
        System.out.println("Physics grade: " + Physics);
        System.out.println("Chemistry grade: " + Chemistry);
        System.out.printf("Average grade: %.1f", Avg);
    }
}
