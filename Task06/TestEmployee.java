package Java1_11;

public class TestEmployee {
    public static void main(String[] args){
        Employee e1 = new Employee(1, "Hiep", "Nguyen", 1500);
        System.out.println("Employee Firstname: " + e1.getFirstName());
        System.out.println("Employee Lastname: " + e1.getLastName());
        System.out.println("Employee Fullname: " + e1.getName());
        System.out.println("Employee Salary: " + e1.getSalary());
        System.out.println("Employee AnnualSalary: " + e1.getAnnualSalary());
        System.out.println(e1.toString());
        // raise salary
        System.out.println("Raise Salary : " + e1.raiseSalary(10));

    }
}
