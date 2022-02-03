package academy.learnprogramming;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	float myMinFloatValue = Float.MIN_VALUE;
    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum dla float: " + myMinFloatValue);
        System.out.println("Maksimum dla float: " + myMaxFloatValue);

    Double myMinDoubleValue = Double.MIN_VALUE;
    Double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum dla Double: " + myMinDoubleValue);
        System.out.println("Maksimum dla Double: " + myMaxDoubleValue);

    int myIntValue = 5 / 3;
    float myFloatValue = 5f / 3f;
    double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue=" + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

    double poundsValue = 200d;
    double kilogramsPerPound = 0.45359237d;
    double kilogramsValue = poundsValue * kilogramsPerPound;
        System.out.println(poundsValue + " funtów to " + kilogramsValue + " kilogramów");

    double pi = 3.1415927d;
    double radius = 25d;
    double area = pi*radius*radius;
        System.out.println(area);
    }
}
