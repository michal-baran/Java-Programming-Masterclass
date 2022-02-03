public class SimpleCalculator {
    //Instance Variables
    private double firstNumber;
    private double secondNumber;

    //Constructor Declaration of Class
    public SimpleCalculator() {
    }

    //method 1
    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double value) {
        firstNumber = value;
    }

    public void setSecondNumber(double value) {
        secondNumber = value;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0.0;
        } else
            return firstNumber / secondNumber;
    }

}