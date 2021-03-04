public class TestStudent {
    public static void main(String[] args){
        Student s1 = new Student("Paul Lee", 3.5);
        Student s2 = new Student("Peter Tan", 3.9);
        System.out.println("Student 1 name is: " + s1.getName());
        System.out.printf("Student 1 gpa is: %.1f%n", s1.setGpa());
        System.out.println("Student 2 name is: " + s2.getName());
        System.out.printf("Student 2 gpa is: %.1f%n", s2.setGpa());
    }
}
