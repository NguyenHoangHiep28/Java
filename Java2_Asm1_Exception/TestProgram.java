package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class TestProgram {

    public static void main(String[] args) {

        PersonManagement management = new PersonManagement();
        Scanner sc = new Scanner(System.in);
        ArrayList <Person> personList = new ArrayList<>();
        System.out.println("\n=====Management Person programmer=====");
        System.out.println("Input Information of Person");
        for (int i = 0; i < 3; ++i) {
            System.out.print("Please input name: ");
            String name = sc.nextLine();

            System.out.print("Please input address: ");
            String address = sc.nextLine();

            System.out.print("Please input salary: ");
            String sSalary = sc.nextLine();
            boolean loop = true;
            while (loop) {
                try {
                    personList.add(management.inputPersonInfo(name, address, sSalary));
                    loop = false;

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.print("Please input salary: ");
                    sSalary = sc.nextLine();
                }
            }
        }
        ArrayList<Person> salarySorted = new ArrayList<>();
        salarySorted = management.sortBySalary(personList);
        salarySorted.forEach(person -> {
            System.out.println("\nInformation of Person you have entered:");
            management.displayPersonInfo(person);
        });
    }
}
