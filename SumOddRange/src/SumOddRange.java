public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum = sum + i;
            }
        }
        if (end < start || start <= 0 || end <= 0) {
            return -1;
        }
        return sum;
    }

}