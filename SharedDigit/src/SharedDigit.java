public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y) {
        if (x < 10 || x > 99 || y < 10 || y > 99)
            return false;

        int remainder1, remainder2, temp = y;
        while (x > 0) {
            remainder1 = x % 10;

            while (y > 0) {
                remainder2 = y % 10;
                if (remainder1 == remainder2) {
                    return true;
                }
                y = y / 10;
            }
            y = temp;
            x /= 10;
        }
        return false;
    }
}