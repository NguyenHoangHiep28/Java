package Task04;

public class Exercise3 {
    public static void main(String[] args){
        int space = 4, botSpace = 1, dots = 0, botDots = 6;
        topAndBot();
        System.out.println();
        for (int line = 1;line<=4; ++line) {
            System.out.print("|");
            topSpace(space);
            System.out.print("\\");
            for (int k = dots; k < 6; ++k) {
                System.out.print(".");
            }
            System.out.print("/");
            topSpace(space);
            --space;
            dots += 2;
            System.out.println("|");
        }
        for (int line = 1;line<=4; ++line) {
            System.out.print("|");
            topSpace(botSpace);
            System.out.print("/");
            for (int k = botDots; k < 6; ++k) {
                System.out.print(".");
            }
            System.out.print("\\");
            topSpace(botSpace);
            ++botSpace;
            botDots -= 2;
            System.out.println("|");
        }
        topAndBot();
    }
    public static void topAndBot(){
        for (int i =0 ; i<10; ++i){
            if (i == 0 || i == 9){
                System.out.print("+");
            } else {
                System.out.print("-");
            }

        }
    }
    public static void topSpace(int spaceNum){
        for (int i = spaceNum; i<4; ++i){
                System.out.print(" ");
        }
    }
}

