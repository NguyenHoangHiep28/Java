package Java1_19;

public class TestMoveable {
    public static void main(String[] args){
        MoveablePoint p1 = new MoveablePoint(1, 2);
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
        p1.moveRight();
        System.out.println(p1);
        //Test Polymorphism
        Moveable p2 = new MoveablePoint(3, 4);//upcast
        p2.moveUp();
        System.out.println(p2);
        MoveablePoint p3 = (MoveablePoint) p2;//downcast
        System.out.println(p3);
    }
}
