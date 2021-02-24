public class PrintLeapYears {
    public static void main(String[] args){
        int startYear = 999, endYear = 2010;
        int year = startYear;
        int count = 0;
        while (year <= endYear) {
            if ((year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0)){
                ++count;
            }
            ++year;
        }
        System.out.println("The number of leap years from " + startYear +
                " to " + endYear + " is: " + count);
    }
}
