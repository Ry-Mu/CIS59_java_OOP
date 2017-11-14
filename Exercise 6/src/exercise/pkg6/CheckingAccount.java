/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg6;

/**
 *
 * @author RyanMunguia
 * Checking accounts have the same properties as an Account and also have a 10-digit routing number 
 * (that could start with a 0 and is included in its identification)
 
 * Checking accounts can also have a negative balance, but as soon as that happens, 
 * the account is flagged as negative and does not allow for further withdrawals. 
 * More funds can be added to the account to get it out of the negative state
 */
public class CheckingAccount extends Account
{
    private int routingNumber;
    
    public CheckingAccount()
    {
        super();
        routingNumber = 0;
        
    }
    
    public CheckingAccount(String i, double b, int r)
    {
        super(i, b);
        routingNumber = r;
    }
    
    public CheckingAccount(SavingsAccount a)
    {
        super(a);
        routingNumber = 0;
    }
    
    public int routingNumber()
    {
        return routingNumber;
    }
    
    public void setRoutingNumber(int i)
    {
        routingNumber = i;
    }
    
    public boolean deposit(double amount)
    {
        balance += amount;
        return true;
    }
    
    @Override
    public boolean withdraw(double amount)
    {
        if (amount > balance)
        {
            System.out.println("Negative balance. Please deposit more cash.");
            return false;
        }
        balance -= amount;
        return true;
    }
    
    public boolean withdraw()
    {
        return true;
    }
   
   
}
