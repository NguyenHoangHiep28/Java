public class ThreeFiveSevenSum {
    public static void main(String[] args) {
        int lowerbound = 1, upperbound = 1000;
        int num = lowerbound;
        int sum = 0;
        while (num <= upperbound) {
            if (((num % 3 == 0) || (num % 5 == 0) || (num % 7 == 0))
                    && ((num % 15 !=0) && (num % 21 !=0) && (num % 105 !=0))){
                sum = sum + num;
            }
            ++num;
        }
        System.out.println("The sum is : " + sum);
    }
}
