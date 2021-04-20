package studentmanagementapp;

import java.sql.*;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentManagement {
    private Connection connection;
    Scanner sc = new Scanner(System.in);
    public StudentManagement() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:52583;instance=SQLEXPRESS;databaseName=SchoolDB;integratedSecurity=true");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void displayMenu(){
        System.out.println("1. Add new student");
        System.out.println("2. Delete");
        System.out.println("3. Display all students");
        System.out.println("4. Exit");
        System.out.print("Enter you choice: ");
    }

    public void addStudent(Student student){
        try {
            String sql = "INSERT INTO Students VALUES(?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, student.getEnrollID());
            ps.setString(2, student.getFirstName());
            ps.setString(3, student.getLastName());
            ps.setInt(4, student.getAge());
            int addStatus =  ps.executeUpdate();
            if (addStatus == 1){
                System.out.println("Add new student successfully!");
            } else {
                System.out.println("Add new student failed!");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public boolean validator(String checkingEnrollId){
        return Pattern.matches("^(GC)[0-9]{5}$", checkingEnrollId);
    }

    public void deleteStudent(String enrollId) {
        try {
            String findSQL = "SELECT * FROM Students WHERE EnrollId = ?";
            PreparedStatement findPS = connection.prepareStatement(findSQL);
            findPS.setString(1, enrollId);
            ResultSet rs = findPS.executeQuery();
            if (rs.next()){
                String sql = "Delete from Students where EnrollId = ?";
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, enrollId);
                int deleteStatus =  ps.executeUpdate();
                if (deleteStatus == 1){
                    System.out.println("Delete student successfully!");
                }
            } else {
                System.out.println("Delete student failed!Cannot find student with EnrollId: " + enrollId + " in Database!");
            }
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    public ResultSet findAllStudent(){
        try {
            String sql = "SELECT * FROM Students";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

}
