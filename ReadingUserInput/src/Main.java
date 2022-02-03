import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //nowa instancja metody Scanner - dane będą odczytywane z konsoli

        System.out.println("Podaj swój rok urodzenia:");

        // utworzenie zmiennej boolowskiej do zweryfikowania czy rok urodzenia jest liczbą całkowitą
        boolean hasNextInT = scanner.hasNextInt();


        if (hasNextInT) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //handle next line character (enter key)

            System.out.println("Podaj swoje imię: ");
            String name = scanner.nextLine();
            int age = 2019 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Twoje imię to " + name + " i masz " + age + " lat");
            } else {
                System.out.println("Nieprawidłowy rok urodzenia.");
            }
        } else {
            System.out.println("Niemożliwe przetworzenie roku urodzn");
        }
        scanner.close();
    }
}
