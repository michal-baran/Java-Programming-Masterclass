public class AreaCalculator {
    public static double area(double radius) {
        double area = -1.0;
        if (radius < 0) {
            area = -1.0;
        } else {
            area = radius * radius * Math.PI;
        }
        return area;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            return x * y;
        }
    }
}
