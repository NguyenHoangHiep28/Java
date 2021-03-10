package Java1_18;

public class TestCasting {
    public static void main(String[] args){
        A a1 = new C();//upcast
        System.out.println(a1);//run C's toString()
        B b1 = (B) a1;
        System.out.println(b1);//run C's toString()
        C c1 = (C) b1;//downcast okay
        System.out.println(c1);//run C's toString()

        A a2 = new B();
        System.out.println(a2);
        B b2 = (B) a2;
        System.out.println(b2);
//        C c2 = (C) a2;
    }
}
