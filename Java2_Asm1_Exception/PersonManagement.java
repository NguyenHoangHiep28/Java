package Assignment;

import java.util.ArrayList;
import java.util.Comparator;

public class PersonManagement {
    public Person inputPersonInfo(String name, String address, String sSalary) throws Exception {
        double salary;
        try {
            salary = Double.parseDouble(sSalary);
            if (salary <= 0) {
                throw new Exception("Salary is greater than zero");
            }
        } catch (NullPointerException e) {
            throw new Exception("You must input Salary.");
        } catch (NumberFormatException e) {
            throw new Exception("You must input digit.");
        }
        return new Person(name, address, salary);
    }

    public void displayPersonInfo(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Salary: " + person.getSalary());
    }

    public ArrayList<Person> sortBySalary(ArrayList<Person> persons){
        persons.sort(Comparator.comparingDouble(Person::getSalary));
        return persons;
    }

}
