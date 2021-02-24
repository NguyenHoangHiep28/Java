public class DayofWeek {
    public static void main(String[] args) {
        String day = "Monday";
        switch (day) {
            case "Sunday":
                System.out.println("First day of the Week");
                break;
            case "Monday":
                System.out.println("Second day of the Week");
                break;
            case "Tuesday":
                System.out.println("Third day of the Week");
                break;
            case "Wednesday":
                System.out.println("Fourth day of the Week");
                break;
            case "Thursday":
                System.out.println("Fifth day of the Week");
                break;
            case "Friday":
                System.out.println("Sixth day of the Week");
                break;
            case "Saturday":
                System.out.println("Seventh day of the Week");
                break;
            default:
                System.out.println("InvalidDay");
        }
    }
}
