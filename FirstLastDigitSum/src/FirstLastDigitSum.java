public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {

        int firstNumber = number % 10;

        if (number < 0) {
            return -1;
        }

        while (number / 10 != 0) {
            number = number / 10;
        }
        return (firstNumber + number);
    }
}