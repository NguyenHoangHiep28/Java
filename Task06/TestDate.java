package Java1_11;

public class TestDate {
    public static void main(String[] args){
        Date dt1 = new Date(1, 6, 2020);
        System.out.println("Day: " + dt1.getDay());
        System.out.println("Month: " + dt1.getMonth());
        System.out.println("Year: " +dt1.getYear());
        System.out.println(dt1.toString());
        //set() methods
        System.out.println("-----------------");
        dt1.setDay(5);
        dt1.setMonth(8);
        dt1.setYear(2021);
        System.out.println("Day: " + dt1.getDay());
        System.out.println("Month: " + dt1.getMonth());
        System.out.println("Year: " +dt1.getYear());
        System.out.println(dt1.toString());
        System.out.println("-----------------");
        dt1.setDate(20, 12,2002);
        System.out.println("Day: " + dt1.getDay());
        System.out.println("Month: " + dt1.getMonth());
        System.out.println("Year: " +dt1.getYear());
        System.out.println(dt1.toString());
    }
}
