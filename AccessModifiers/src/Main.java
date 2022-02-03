public class Main {

    public static void main(String[] args) {
        Account konto = new Account("Michał");
        konto.deposit(1000);
        konto.withdraw(500);
        konto.withdraw(-200);
        konto.deposit(-20);
        konto.calculateBalance();

        System.out.println("Saldo na koncie wynosi " + konto.getBalance() + " PLN");
        konto.calculateBalance();
    }
}
