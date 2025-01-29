package Section9.domain;

public class Account {
    private static final double TAX = 5.00;
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public Account(int accountNumber, String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        deposit(balance);
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) {
        this.balance -= value + TAX;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }


    @Override
    public String toString() {
        return "Account " + this.accountNumber + ", "
                + "Holder: " + this.accountHolder +
                ", Balance: $ " + String.format("%.2f", this.balance);
    }
}
