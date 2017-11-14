/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.time.LocalDateTime;

/**
 *
 * @author RyanMunguia
 */
public class SavingsAccount extends Account
{
    private double interestRate;
    private int withdrawCount;

    public SavingsAccount()
    {
        super();
        interestRate = 0.0;
        withdrawCount = 0;
    }

    public SavingsAccount(String i, double b, double ir)
    {
        super(i, b);
        interestRate = ir;
        withdrawCount = 0;
    }

    public SavingsAccount(SavingsAccount a)
    {
        super(a);
        interestRate = a.getInterestRate();
        withdrawCount = a.getWithdrawCount();
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    public int getWithdrawCount()
    {
        return withdrawCount;
    }
    
    public boolean deposit(double amount)
    {
        balance += amount;
        return true;
    }
    
    @Override
    public boolean withdraw(double amount)
    {
        if (amount > balance || withdrawCount == 3)
            return false;
        
        balance -= amount;
        withdrawCount++;
        return true;
    }

    public boolean withdraw()
    {
        return true;
    }
    
    public void setInterestRate(double i)
    {
        interestRate = i;
    }
    
    public void applyInterest()
    {
        balance += balance * (interestRate / 100);
    }
    
    public void incrementWithdrawCount()
    {
        withdrawCount++;
    }
    
    public void resetWithdrawCount()
    {
        withdrawCount = 0;
    }
    
    public String toString()
    {
        return String.format("%s: $%.2f at %.2f%% has %d withdraws and was created on %s", 
                id, balance, interestRate, withdrawCount, dateCreated);
    }
}
