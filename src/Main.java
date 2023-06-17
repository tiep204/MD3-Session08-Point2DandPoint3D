import ra.Point2D;
import ra.Point3D;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D first2DPoint=new Point2D(3, 4);
        Point3D first3DPoint=new Point3D(4, 5,7);
        Point3D point3D = new Point3D();

        System.out.println(first2DPoint.toString());
        System.out.println(first3DPoint.toString());
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}