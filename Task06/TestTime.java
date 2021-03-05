package Java1_11;

public class TestTime {
    public static void main(String[] args){
        Time t1 = new Time(20,50,45);
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());
        System.out.println(t1);
        System.out.println("---------------------------");
        //set() methods
        t1.setHour(10);
        t1.setMinute(58);
        t1.setSecond(40);
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());
        System.out.println(t1);
        System.out.println("---------------------------");
        t1.setTime(19,50,59);
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());
        System.out.println(t1);
        System.out.println(t1.nextSecond());
        System.out.println(t1.previousSecond());
    }
}
