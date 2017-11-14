/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg6;

import java.time.LocalDateTime;
/**
 *
 * @author RyanMunguia
 */
public class Account 
{
    protected String id;
    protected double balance;
    protected DateTime dateCreated;
    
    protected void setDateCreated()
    {
        LocalDateTime now = LocalDateTime.now();
        dateCreated = new DateTime(now.getMonthValue(), now.getDayOfMonth(), now.getYear(),
            now.getHour(), now.getMinute(), now.getSecond());
    }
    
    public Account()
    {
        id = "";
        balance = 0.0;
        setDateCreated();
    }

    public Account(String i, double b)
    {
        id = i;
        balance = b;
        setDateCreated();
    }
    
    public Account(Account a)
    {
        id = a.getId();
        balance = a.getBalance();
        dateCreated = a.getDateCreated();
    }
    
    public String getId()
    {
        return id;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public DateTime getDateCreated()
    {
        return new DateTime(dateCreated);
    }
    
    public void setId(String i)
    {
        id = i;
    }

    public boolean deposit(double amount)
    {
        balance += amount;
        return true;
    }
    
    public boolean withdraw(double amount)
    {
        if (amount > balance)
            return false;

        balance -= amount;
        return true;
    }
    
    public String toString()
    {
        return String.format("%s: $%.2f and was created on %s", 
                id, balance, dateCreated);
    }
}
