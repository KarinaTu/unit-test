package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testApp()
    {
        assertTrue(3>2);
    }

    @Test
    public void testAccountCreationAndBalanceSet()
    {
        int initialBalance = 2;
        Account account = new Account();
        account.setBalance(initialBalance);
        assertTrue(account.getBalance()==initialBalance);
    }

    @Test
    public void testAccountCreationAndNegativeBalanceSet()
    {
        int inputBalance = -10;
        Account account = new Account();
        account.setBalance(inputBalance);
        assertEquals(account.getBalance(), inputBalance);
    }

    @Test
    public void testPositiveDeposit() {
        Account xxx = new Account();
        xxx.setBalance(1);
        xxx.depositBalance(3);
        assertEquals( 4, xxx.getBalance() );
    }

    @Test
    public void testNegativeDeposit() {
        int initialBalance = 1;
        Account account = new Account();
        account.setBalance(initialBalance);
        account.depositBalance(-3);
        assertEquals( initialBalance, account.getBalance() );
    }

    @Test
    public void testWithdrawalSuccess(){
        int intBalance = 6;
        Account account = new Account();
        account.setBalance(intBalance);
        account.withdrawal(4);
        assertEquals(2, account.getBalance());
    }

    @Test
    public void testWithdrawalFail(){
        int intBalance = 6;
        Account account = new Account();
        account.setBalance(intBalance);
        account.withdrawal(10);
        assertEquals(intBalance,account.getBalance());
    }








}
