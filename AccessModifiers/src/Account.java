import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.transactions.add(amount);
            this.balance += amount;
            System.out.println("Wpłacono " + amount + " PLN. Obecne saldo wynosi " + balance + " PLN.");
        } else {
            System.out.println("Nie można wpłacić ujemnych kwot ");
        }
    }

    public void withdraw(int amount) {
        int withdraw = -amount;
        if (withdraw < 0) {
            this.transactions.add(withdraw);
            this.balance += withdraw;
            System.out.println("Wypłacono " + amount + " PLN. Obecne saldo wynosi " + balance + " PLN.");
        } else {
            System.out.println("Nie można wypłacać ujemnych kwot");
        }
    }

    public void calculateBalance() {
        this.balance = 0;
        for (int i : this.transactions) {
            this.balance += i;
        }
        System.out.println("Aktualne saldo wynosi " + this.balance + " PLN.");
    }
}
