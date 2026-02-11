package oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountBehaviorTest {

    @Test
    void savingsMonthlyUpdate_appliesInterest() {
        SavingsAccount s = new SavingsAccount("S-100", 1000.00, 0.12); // 12% annual
        s.monthlyUpdate(); // 1% monthly
        assertEquals(1010.00, s.getBalance(), 0.0001);
    }

    @Test
    void checkingMonthlyUpdate_deductsFeeWhenPossible() {
        CheckingAccount c = new CheckingAccount("C-200", 100.00, 10.00);
        c.monthlyUpdate();
        assertEquals(90.00, c.getBalance(), 0.0001);
    }
}
