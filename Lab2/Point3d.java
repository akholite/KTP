public class Point3d {
    private double x;
    private double y;
    private double z;

    public Point3d(double a, double b, double c) {
        x = a;
        y = b;
        z = c;
    }

    public Point3d() {
        this(0.0, 0.0, 0.0);
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    public void setX(double a) {
        x = a;
    }
    public void setY(double b) {
        y = b;
    }
    public void setZ(double c) {
        z = c;
    }

    public boolean isEqual(Point3d pt) {
        if (x == pt.x && y == pt.y && z == pt.z)
            return true;
        else
            return false;
    }

    public double distanceTo(Point3d pt) {
        double distance = Math.sqrt((x - pt.x)*(x - pt.x) + (y - pt.y)*(y - pt.y) + (z - pt.z)*(z - pt.z));
        return (double) Math.round(distance * 100) / 100;
    }
}
