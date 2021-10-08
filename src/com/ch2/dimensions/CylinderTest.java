package src.com.ch2.dimensions;

public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cyl = new Cylinder(5,2);
        double vol = cyl.getVolume();
        System.out.println("radius = 5 height = 2 volume = " + vol);
        double sa = cyl.getSurfaceArea();
        System.out.println("surface area = " + sa);

        Cylinder cyl2 = new Cylinder(8,6);
        vol = cyl2.getVolume();
        System.out.println("radius = 8 height = 6 volume = " + vol);
        sa = cyl2.getSurfaceArea();
        System.out.println("surface area = " + sa);
    }
}