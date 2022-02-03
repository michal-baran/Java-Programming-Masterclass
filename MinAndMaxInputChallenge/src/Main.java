import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Podaj kolejną liczbę: ");
            boolean isAnInt = sc.hasNextInt();

            if (isAnInt) {

                number = sc.nextInt();

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }

            } else {
                sc.close();
                break;
            }
        }
        System.out.println("Max = " + max + ", Min = " + min);
    }
}
