public class CylinderComputation {
    public static void main(String[] args) {
        double radius, height, surfaceArea, baseArea, volume;
        radius = 2.0;
        height = 3.5;
        final double PI = 3.14159265;
        baseArea = PI*radius*radius;
        surfaceArea = 2*PI*radius*height + 2*baseArea;
        volume = baseArea * height;

        System.out.print("The radius is: ");
        System.out.println(radius);
        System.out.print("The height is: ");
        System.out.println(height);
        System.out.print("The base area is: ");
        System.out.println(baseArea);
        System.out.print("The surface area is: ");
        System.out.println(surfaceArea);
        System.out.print("The volume is: ");
        System.out.println(volume);
    }
}
