public class PaintJob {

    // Metoda z wszystkimi parametrami
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0 || extraBuckets < 0) {
            return -1;
        }
        double calcArea = width * height;
        double neededBuckets = calcArea / areaPerBucket - extraBuckets;

        return (int) Math.ceil(neededBuckets);
    }

    // Metoda bez znajomości dodatkowych wiader z farbą
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0) {
            return -1;
        }
        double calcArea = width * height;
        double neededBuckets = calcArea / areaPerBucket;

        return (int) Math.ceil(neededBuckets);
    }

    // Metoda bez znajomości wysokości i szerokości ściany do pomalowania
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0.0 || areaPerBucket <= 0.0) {
            return -1;
        }

        double neededBuckets = area / areaPerBucket;

        return (int) Math.ceil(neededBuckets);
    }
}