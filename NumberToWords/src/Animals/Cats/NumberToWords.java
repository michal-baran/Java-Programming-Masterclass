package Animals.Cats;

public class NumberToWords {
    //Metoda konwertująca liczby na słowa
    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");

        int digits = getDigitCount(number);
        number = reverse(number);
        int testNumber = 0;

        while (digits > 0) {
            testNumber = number % 10;
            switch (testNumber) {
                case 0: {
                    System.out.println("Zero");
                    break;
                }
                case 1: {
                    System.out.println("One");
                    break;
                }
                case 2: {
                    System.out.println("Two");
                    break;
                }
                case 3: {
                    System.out.println("Three");
                    break;
                }
                case 4: {
                    System.out.println("Four");
                    break;
                }
                case 5: {
                    System.out.println("Five");
                    break;
                }
                case 6: {
                    System.out.println("Six");
                    break;
                }
                case 7: {
                    System.out.println("Seven");
                    break;
                }

                case 8: {
                    System.out.println("Eight");
                    break;
                }
                case 9: {
                    System.out.println("Nine");
                    break;
                }
            }
            number /= 10;
            digits--;
        }
    }

    //Metoda odwracająca zadaną liczbę
    public static int reverse(int number) {
        int digits = getDigitCount(Math.abs(number));
        int revNumber = 0;

        while (digits > 0) {
            revNumber = revNumber * 10 + number % 10;
            number /= 10;
            digits--;
        }
        return revNumber;
    }

    //Metoda podająca liczbę cyfr
    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        int digits = 0;

        do {
            digits++;
            number /= 10;
        } while (number > 0);

        return digits;
    }
}
