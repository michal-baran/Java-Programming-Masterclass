public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int a, int b) {
        if (a < 10 || b < 10) { //checking if any of values is less than "0"
            return -1;
        }
        int divisor; // Declaring variable "divisor"

        // Determine which of the numbers is less and assume it as the initial divisor
        if (a < b) {
            divisor = a;
        } else {
            divisor = b;
        }

        // Decrementing divisor value until remainders of both values are 0
        while ((a % divisor != 0) || (b % divisor != 0)) {
            divisor--;
        }

        // Return last divisor value
        return divisor;
    }
}