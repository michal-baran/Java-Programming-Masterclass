import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(49);
        }

        for (int i : numbers) {
            System.out.println("Wylosowana liczba to " + i);
        }
    }
}
//8, 14, 16, 19, 37, 47
