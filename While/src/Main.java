public class Main {
    public static void main(String[] args) {
//        int count = 6;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for (int i = 6; i != 6; i++) {
//            System.out.println("Count value is " + count);
//        }
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count > 100) {
//                break;
//            }
//
//        } while (count != 6);
//    }

        int number = 0;
        int finishNumber = 20;
        int total = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Liczba parzysta " + number);

            total++;
            if (total >= 5) {
                System.out.println("Wykryto 5 liczb parzystych. Koniec.");
                break;
            }
        }

    }


    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
