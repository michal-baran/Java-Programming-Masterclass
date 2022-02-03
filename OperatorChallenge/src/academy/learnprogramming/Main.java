package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        double firstValue = 20.00;
        double secondValue = 80.00;
        double myValuesTotal = (firstValue + secondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double remainder = myValuesTotal % 40.0;
        System.out.println("The remainder equals" + remainder);
        boolean isRemainderEqualsZero = (remainder == 0) ? true : false;
        System.out.println("Our boolean variable is " + isRemainderEqualsZero);
        if (isRemainderEqualsZero == false) {
            System.out.println("Got some remainder");

        }
    }
}
