public class Main {
    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Poniedziałek");
                break;
            case 1:
                System.out.println("Wtorek");
                break;
            case 2:
                System.out.println("Sroda");
                break;
            case 3:
                System.out.println("Czwartek");
                break;
            case 4:
                System.out.println("Piątek");
                break;
            case 5:
                System.out.println("Sobota");
                break;
            case 6:
                System.out.println("Niedziela");
                break;

            default:
                System.out.println("Wartość spoza zakresu");
                break;
        }
    }
}
