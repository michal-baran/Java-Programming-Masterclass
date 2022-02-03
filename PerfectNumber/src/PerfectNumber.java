public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;

        int i = number - 1;
        int sum = 0;

        while (i > 0) {
            if (number % i == 0) {
                sum += i;
            }
            i--;
        }
        return (number == sum);
    }
}