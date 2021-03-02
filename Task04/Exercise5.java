package Task04;

public class Exercise5 {
    public static void main(String[] args){
        int space = 1;
       for (int i = 1; i<=9; i+=2){
           for (int j = 5; j>=space; --j){
               System.out.print(" ");
           }
           for (int k = i; k >=1;--k){
               System.out.print("*");
           }
           System.out.println();
           ++space;
       }
    }
}
