/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg6;

/**
 *
 * @author RyanMunguia
 * Long term savings accounts have the same properties as an Account and a flag that indicates 
 * whether or not it is enabled for deposit and withdraw transactions
 * 
 * If the flag is set to false, no deposits or withdraws are allowed
 * If the flag is set to true, only withdraws are allowed. Deposits remain disabled
 */
public class LongTermSavingsAccount extends Account
{
    private boolean flag = true;
    
   public LongTermSavingsAccount()
    {
        super();
    }
   
   public LongTermSavingsAccount(String i, double b)
    {
        super(i, b);
    }
   
   public boolean enabledSavings()
    {
        if (flag == false)
        {
            System.out.println("Your account is disabled. Please enable it to withdraw.");
            return false;
        }
        System.out.println("Your account is enabled and able to withdraw.");
        return true;
    }
   
   public void setTrue()
    {
        flag = true;
    }
   
   public void setFalse()
    {
        flag = false;
    }
   
   @Override
   public boolean deposit(double amount)
    {
        System.out.println("Sorry, deposits are not permitted for this type of account. Please contact agent for help.");
        return false;
    }
   
   @Override
   public boolean withdraw(double amount)
    {
        if(flag == true || amount > balance)
            return false;
        
        balance -= amount;
        return true;
        
        //System.out.println("Sorry, deposits are not permitted for this type of account. Please contact agent for help.");
        //return false;
    }
}
