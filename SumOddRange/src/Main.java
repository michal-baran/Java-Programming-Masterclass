public class Main {
    public static void main(String[] args) {
        System.out.println("Suma liczb parzystych to: " + SumOddRange.sumOdd(1, 100));
        System.out.println("Suma liczb parzystych to: " + SumOddRange.sumOdd(-1, 100));
        System.out.println("Suma liczb parzystych to: " + SumOddRange.sumOdd(100, 100));
        System.out.println("Suma liczb parzystych to: " + SumOddRange.sumOdd(13, 13));
        System.out.println("Suma liczb parzystych to: " + SumOddRange.sumOdd(100, -100));
        System.out.println("Suma liczb parzystych to: " + SumOddRange.sumOdd(100, 1000));
    }
}
