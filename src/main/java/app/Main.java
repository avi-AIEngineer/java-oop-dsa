package app;

import oop.CheckingAccount;
import oop.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("S-100", 1000.0, 0.12);
        CheckingAccount c = new CheckingAccount("C-200", 100.0, 10.0);

        System.out.println("=== Before monthlyUpdate ===");
        System.out.println("Savings balance: " + s.getBalance());
        System.out.println("Checking balance: " + c.getBalance());

        s.monthlyUpdate();
        c.monthlyUpdate();

        System.out.println("\n=== After monthlyUpdate ===");
        System.out.println("Savings balance: " + s.getBalance());
        System.out.println("Checking balance: " + c.getBalance());
    }
}
