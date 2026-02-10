package oop;

public class CheckingAccount extends Account {
    private final double monthlyFee;

    public CheckingAccount(String accountNumber, double openingBalance, double monthlyFee) {
        super(accountNumber, openingBalance);
        if (monthlyFee < 0) throw new IllegalArgumentException("Monthly fee must be >= 0");
        this.monthlyFee = monthlyFee;
    }

    @Override
    public void monthlyUpdate() {
        if (monthlyFee == 0) return;
        if (getBalance() >= monthlyFee) {
            setBalance(getBalance() - monthlyFee);
        }
    }
}