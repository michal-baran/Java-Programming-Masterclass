package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// byte
    // short
    // int
    // long
    // float
    // double
    // char
    // boolean
        String myString = "To jest mój string";
        System.out.println("myString jest równe " + myString);
        myString = myString + " coś takiego";
        System.out.println("myString jest równe " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString jest równe " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.4d;
        lastString = lastString + doubleNumber;
        System.out.println("Lastsrting is equal to " + lastString);
    }
}
