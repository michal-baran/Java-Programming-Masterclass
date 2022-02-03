import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        double avg=0;
        int i = 1;

        while (true) {
            if (sc.hasNextInt()) {
                sum += sc.nextInt();
                avg = Math.round(sum / i);
                i++;
            } else {
                sc.close();
                break;
            }
        }
        System.out.println("SUM = " + (int)sum + " AVG = " + (int)avg);
    }
}