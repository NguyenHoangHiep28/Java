package Session10;

public class EmployeeDetails {
    public static void main(String[] args){
//        Instantiate the Employee class object
        Employee objEmp = new Employee("E001", "Maria Nemeth", 40000);
//        Invoke the calcCommission() with float argument
        objEmp.calcCommission(20000F);
        objEmp.displayDetails();
        System.out.println("------------------------");
        //Instantiate the Employee object as PartTimeEmployee
        Employee objEmp1 = new PartTimeEmployee("E002", "Rob Smith", 30000, "Day");
        objEmp1.displayDetails();
    }
}
