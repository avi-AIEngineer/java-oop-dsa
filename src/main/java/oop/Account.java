package oop;

public abstract class Account {
    private final String accountNumber;
    private double balance;

    public Account(String accountNumber, double openingBalance) {
        if (openingBalance < 0) throw new IllegalArgumentException("Opening balance must be >= 0");
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be > 0");
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdraw must be > 0");
        if (amount > getBalance()) throw new IllegalArgumentException("Insufficient funds");
        setBalance(getBalance() - amount);
    }

    public abstract void monthlyUpdate();
}
