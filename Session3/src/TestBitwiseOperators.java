public class TestBitwiseOperators {
    public static void main(String[] args) {
        int x = 23;
        int y = 12;
        //23 = 10111, 12 = 01100
        System.out.print("x & y : ");
        System.out.println(x&y);
        System.out.print("x|y : ");
        System.out.println(x|y);
        System.out.print("x^y : ");
        System.out.println(x^y);
        int a = 43;
        int b = 1;
        System.out.print("a >> b: ");
        System.out.println(a>>b);
        System.out.print("a << b: ");
        System.out.println(a<<b);
    }
}
