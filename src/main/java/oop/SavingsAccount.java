package oop;

public class SavingsAccount extends Account implements InterestBearing {
    private final double annualRate;

    public SavingsAccount(String accountNumber, double openingBalance, double annualRate) {
        super(accountNumber, openingBalance);
        this.annualRate = annualRate;
    }

    @Override
    public double getAnnualRate() {
        return annualRate;
    }

    @Override
    public void monthlyUpdate() {
        double monthlyRate = annualRate / 12.0;
        setBalance(getBalance() * (1.0 + monthlyRate));
    }
}