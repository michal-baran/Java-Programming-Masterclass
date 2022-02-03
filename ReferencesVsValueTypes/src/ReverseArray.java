import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array) {
        int[] reversedArray = array.clone();
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - i - 1];
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
    }
}