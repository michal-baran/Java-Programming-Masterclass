public class NumberPalindrome {
    public static boolean isPalindrome(int number) {

        int startNumber = Math.abs(number);
        number = Math.abs(number);
        int reverse = 0;

        do {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;

        } while (number > 0);

        return (startNumber == reverse);
    }
}
