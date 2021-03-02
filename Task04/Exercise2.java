package Task04;

public class Exercise2 {
    public static void main(String[] args){
        int space = 1;
        for (int i = 9; i>=1; i-=2){
            for (int k = 1; k <= space; ++k){
                System.out.print(" ");
            }
            for (int j = i; j >0; --j){
                System.out.print("*");
            }
            System.out.println();
            ++space;
        }
    }
}
