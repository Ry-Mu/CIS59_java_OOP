/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg6;

/**
 *
 * @author RyanMunguia
 */
public class Exercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
     {
        Time t = new Time(19,20,20);
        System.out.println(t);
        DateTime d = new DateTime(10,30,2017,t);
        System.out.println(d);
        t.setHour(2);
        System.out.println(d);
        Time t2 = d.getTime();
        System.out.println(t2);
        t2.setHour(5);
        System.out.println(d);
        System.out.println(t2);
        System.out.println(d.getHour());
        
        System.out.println("****************************************************");
        System.out.println("Savings Account Info:");
        SavingsAccount s = new SavingsAccount("111", 5000.00, 3.5);
        System.out.println(s);
        System.out.println(s.withdraw(50));
        System.out.println(s);
        
        Account a = new Account("222", 200.00);
        a.deposit(400);
        a.withdraw(25);
        a.withdraw(1000);
        System.out.println(a);
        
        System.out.println("****************************************************");
        System.out.println("Checking Account Info:");
        CheckingAccount c = new CheckingAccount("123", 500.00, 123456789);
        System.out.println(c);
        c.deposit(200);
        System.out.println("Deposited $200");
        System.out.println(c);
        System.out.println("The routing number is: " +c.routingNumber());
        c.withdraw(100);
        System.out.println("Withdrew $100");
        System.out.println("The new balance is: "+ c.getBalance());
        
        System.out.println("****************************************************");
        System.out.println("Long Term Savings Account Info:");
        LongTermSavingsAccount lts = new LongTermSavingsAccount("225", 750.00);
        System.out.println(lts);
        System.out.println(lts.enabledSavings());
        lts.setFalse();
        System.out.println(lts.enabledSavings());
        lts.deposit(200);
        
        
    }
    
}
