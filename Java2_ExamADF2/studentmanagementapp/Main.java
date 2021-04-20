package studentmanagementapp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();
        int choice = 0;
        String enrollID;
        System.out.println("\n=======Student Management Program=======\n");
        while (true) {
            sm.displayMenu();
            while (true) {
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("Please enter a number to choose an available choice!");
                    System.out.print("Enter you choice: ");                }
            }
            switch (choice) {
                case 1:
                    System.out.println("Please enter student's details: ");
                    while (true) {
                        System.out.println("- Student EnrollID : ");
                        enrollID = sc.nextLine();
                        if (!sm.validator(enrollID)) {
                            System.out.println("Please input Student EnrollId in right format (Ex: GC00001)");
                        } else {
                            break;
                        }
                    }
                    System.out.println("- Student first name: ");
                    String firstName = sc.nextLine();
                    System.out.println("- Student last name: ");
                    String lastName = sc.nextLine();
                    System.out.println("- Student age: ");
                    int age = Integer.parseInt(sc.nextLine());
                    Student student = new Student(enrollID, firstName, lastName, age);
                    sm.addStudent(student);
                    break;
                case 2:
                    System.out.println("Enter student enrollid:");
                    while (true) {
                        System.out.println("- Student EnrollID : ");
                        enrollID = sc.nextLine();
                        if (!sm.validator(enrollID)) {
                            System.out.println("Please input Student EnrollId in right format (Ex: GC00001)");
                        } else {
                            break;
                        }
                    }
                    sm.deleteStudent(enrollID);
                    break;
                case 3:
                    List<Student> studentsList = new ArrayList<>();
                    ResultSet rs = sm.findAllStudent();
                    try {
                        while (rs.next()) {
                            Student newStudent = new Student();
                            newStudent.setEnrollID(rs.getString("EnrollId"));
                            newStudent.setFirstName(rs.getString("FirstName"));
                            newStudent.setLastName(rs.getString("LastName"));
                            newStudent.setAge(rs.getInt("Age"));
                            studentsList.add(newStudent);
                        }
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
                    System.out.println("EnrollID\t\t\t\tFullName\t\t\tAge");
                    System.out.println("----------   --------------------------   --------");
                    for (Student std : studentsList) {
                        System.out.println(std.getEnrollID() + "\t\t\t" + std.getLastName() + " "
                                + std.getFirstName() + "\t\t\t\t" + std.getAge());
                    }
                    break;
                case 4:
                    System.out.println("\n========================================================");
                    System.out.println("\t\t\t\t\tEnd program... ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please choose available option.");
            }
                System.out.println("\nWhat do you want to do next ?\n");
        }
    }
}