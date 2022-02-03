import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] result = new int[array.length];
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - i - 1];
        }
        return result;
    }
}