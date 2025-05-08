public class Main {
    public static void main(String[] args) {
        // Kiểm thử Point2D
        Point2D p2d = new Point2D(3.5f, 7.2f);
        System.out.println("Point2D: " + p2d);
        p2d.setXY(1.1f, 2.2f);
        System.out.println("Updated Point2D: " + p2d);
        float[] xy = p2d.getXY();
        System.out.println("XY Array: [" + xy[0] + ", " + xy[1] + "]");

        // Kiểm thử Point3D
        Point3D p3d = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + p3d);
        p3d.setXYZ(9.9f, 8.8f, 7.7f);
        System.out.println("Updated Point3D: " + p3d);
        float[] xyz = p3d.getXYZ();
        System.out.println("XYZ Array: [" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + "]");
    }
}