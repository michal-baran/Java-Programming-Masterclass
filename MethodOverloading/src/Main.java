public class Main {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(20);
        calcFeetAndInchesToCentimeters(2, 1);
        System.out.println(sumNumbers(1,2));
        System.out.println(sumNumbers(1,2,3));
        System.out.println(sumNumbers(1,2,3,4));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Nieprawidłowe dane wejściowe");
            return -1;
        } else {
            double centimeters = (feet * 12 + inches) * 2.54;
            System.out.println("Stopy: " + feet + ", Cale: " + inches + " = " + centimeters + " centymetrów");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Nieprawidłowe dane wejściowe");
            return -1;
        } else {
            double feet = (inches - inches % 12) / 12;
            double inchesInteger = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, (inchesInteger));
        }
    }

    public static int sumNumbers (int a, int b, int c, int d) {
        return a+b+c+d;
    }
    public static int sumNumbers (int a, int b, int c) {
        return a+b+c;
    }
    public static int sumNumbers (int a, int b) {
        return a+b;
    }
}
