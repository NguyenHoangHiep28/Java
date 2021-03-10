package Session10;

public class Employee {
    String empId;
    String empName;
    int salary;
    float commission;

    /**
     * Parameterized constructor to initialize the variables
     *
     * @param id a String variable storing employee id
     * @param name a String variable storing employee name
     * @param sal an integer variable storing salary
     *
     */
    public Employee(String id, String name, int sal){
        empId = id;
        empName = name;
        salary = sal;
    }

    /**
     * Calculates commission based on sales value
     * @param sales a float variable storing sales value
     *
     * @return void
     */
    public void calcCommission(float sales){
        if (sales > 10000){
            commission = salary*20/100;
        }else commission = 0;
    }

    public void calcCommission(int overtime){
        if (overtime > 8)
            commission = salary/30;
        else
            commission = 0;
    }
    public void displayDetails(){
        System.out.println("EmployeeID: "  + empId);
        System.out.println("EmployeeName: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Commission: " + commission);
    }

}
