package Task04;

import java.util.Scanner;

public class studentScholarship {
    public static void main(String[] args){
        String student1, student2;
        int maths1, maths2;
        int science1, science2;
        int english1, english2;
        int sum1, sum2;
        float percentage1, percentage2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of student 1 : ");
        student1 = input.next();
        System.out.println("Enter marks obtain in Maths: ");
        maths1 = input.nextInt();
        System.out.println("Enter marks obtain in Science: ");
        science1 = input.nextInt();
        System.out.println("Enter marks obtain in English: ");
        english1 = input.nextInt();
        System.out.println();
        System.out.println("Enter name of student 2 : ");
        student2 = input.next();
        System.out.println("Enter marks obtain in Maths: ");
        maths2 = input.nextInt();
        System.out.println("Enter marks obtain in Science: ");
        science2 = input.nextInt();
        System.out.println("Enter marks obtain in English: ");
        english2 = input.nextInt();
        System.out.println("Marks of " + student1 +":");
        System.out.println("Maths = " + maths1);
        System.out.println("Science = " + science1);
        System.out.println("English = " + english1);
        System.out.println();
        System.out.println("Marks of " + student2 +":");
        System.out.println("Maths = " + maths2);
        System.out.println("Science = " + science2);
        System.out.println("English = " + english2);
        sum1 = maths1 + science1 + english1;
        sum2 = maths2 + science2 + english2;
        percentage1 = (float) sum1 / 300 * 100;
        percentage2 = (float) sum2 / 300 * 100;
        System.out.println("Total marks scored by " + student1
                + " = " + sum1);
        System.out.printf("Percentage = %.0f", percentage1);
        System.out.println("%");
        System.out.println();
        System.out.println("Total marks scored by " + student2
                + " = " + sum2);
        System.out.printf("Percentage = %.0f", percentage2);
        System.out.println("%");
        System.out.println();
        System.out.print("Is " + student1+ " percentage less than "
                + student2 + " ?");
//        if (percentage1 < percentage2) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
        System.out.println(percentage1 < percentage2 ? "Yes" : "No");

        System.out.print("Is " + student1+ " percentage greater than "
                + student2 + " ?");
        if (percentage1 > percentage2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.print("Is " + student1+ "'s" + " and "
                + student2 + "'s" +"percentage are equal?");
        if (percentage1 == percentage2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println();
        if (percentage1 > 75){
            System.out.println("Scholarship amount for " +
                    student1 + " = $2000");
        } else if (percentage1>=60 && percentage1 <= 75){
            System.out.println("Scholarship amount for " +
                    student1 + " = $1000");
        } else {
            System.out.println("Scholarship amount for " +
                    student1 + " = $0");
        }
        if (percentage2 > 75){
            System.out.println("Scholarship amount for " +
                    student2 + " = $2000");
        } else if (percentage2>=60 && percentage2 <= 75){
            System.out.println("Scholarship amount for " +
                    student2 + " = $1000");
        } else {
            System.out.println("Scholarship amount for " +
                    student2 + " = $0");
        }
    }
}