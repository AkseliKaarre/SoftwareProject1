package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void testDeposit(){
        Account account = new Account();
        account.deposit(90.0);
        assertEquals(90.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawSufficientFunds() {
        Account account = new Account();
        account.deposit(100.0);
        assertEquals(50.0, account.withdraw(50.0), 0.001);
        assertEquals(50.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithDrawInsufficientAmounts() {
        Account account = new Account();
        account.deposit(50.0);
        assertEquals(0.0, account.withdraw(100.0), 0.001);
        assertEquals(50.0, account.getBalance(), 0.001);
    }
}
