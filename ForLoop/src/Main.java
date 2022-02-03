public class Main {

    public static void main(String[] args) {

        int sum = 0;
        for (int n = 10; n <= 50; n++) {
            if (isPrime(n)) {
                sum++;
                System.out.println("Liczba " + n + " jest liczbą pierwszą");
                if (sum == 15) {
                    System.out.println("Wychodzę z pętli FOR");
                    break;
                }
            }
        }

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}