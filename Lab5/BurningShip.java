import java.awt.geom.Rectangle2D;

public class BurningShip extends FractalGenerator
{
    public static final int MAX_ITERATIONS = 2000;

    public void getInitialRange(Rectangle2D.Double rect)
    {
        rect.setRect(-2, -2.5, 4, 4);
    }


    public int numIterations(double x, double y)
    {
        int n = 0;
        double real = 0;
        double imaginary = 0;

        while (n < MAX_ITERATIONS && real * real + imaginary * imaginary < 4) {
            double realnew = real * real - imaginary * imaginary + x;
            double imaginarynew = 2 * Math.abs(real) * Math.abs(imaginary) + y;
            real = realnew;
            imaginary = imaginarynew;
            n++;
        }

        if (n == MAX_ITERATIONS)
            return -1;

        return n;
    }

    public String toString() {
        return "Burning Ship";
    }

}