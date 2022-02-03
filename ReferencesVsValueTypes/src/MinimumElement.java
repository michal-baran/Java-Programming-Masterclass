import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[size];

        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt();
        }
        return elements;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}