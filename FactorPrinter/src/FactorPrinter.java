public class FactorPrinter {
    public static void printFactors(int number) {
        // Check if number is greater or equal one
        if (number < 1) System.out.println("Invalid Value");

        // FOR Loop
        for (int i = 1; (i <= number); i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}