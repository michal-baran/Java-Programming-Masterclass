public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            if (number%2!=0) {
                number = number / 10;
                continue;
            }
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}