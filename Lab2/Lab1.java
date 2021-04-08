import java.util.*;

/**Класс исполняем, принимает на вход координаты трех точек
 * трехмерного пространства и либо выводит площадь составляемого
 * ими треугольника, либо выводит сообщение о том,
 * что какие-то из заданных точек совпадают**/
public class Lab1 {
    public static void main(String[] args) {

        Point3d[] points = {
                new Point3d(),
                new Point3d(),
                new Point3d()
        };

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.printf("Введите координаты %d-ой точки через пробел: ", i + 1);
            String s = sc.nextLine();
            String[] coords = s.split("\\s+");
            points[i].setX(Double.parseDouble(coords[0]));
            points[i].setY(Double.parseDouble(coords[1]));
            points[i].setZ(Double.parseDouble(coords[2]));
        }


        if (points[0].isEqual(points[1]) || points[0].isEqual(points[2])
        || points[1].isEqual(points[2]))
            System.out.println("Две из трех точек равны");
        else {
            System.out.printf("Площадь треугольника: %.3f", computeArea(points[0], points[1], points[2]));
        }
    }
/**Принимает на вход три (различные) точки и вычисляет площадь
    составляемого ими треугольника по формуле Герона **/
    public static double computeArea(Point3d x, Point3d y, Point3d z) {
        double a = x.distanceTo(y);
        double b = y.distanceTo(z);
        double c = z.distanceTo(x);

        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
