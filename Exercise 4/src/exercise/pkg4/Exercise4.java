/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg4;

/**
 *
 * @author RyanMunguia
 */
public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        System.out.println("test");
        Time t1 = new Time();
        Time t2 = new Time(9,30,0);
        Time t3 = new Time(24,30,0);
        Time t4 = new Time(20,66,0);
        Time t5 = new Time(20,26,64);
        
        DateTime dt1 = new DateTime(3,6,92, t2);
        DateTime dt2 = new DateTime(4,6,94,7,22,59);
        
        t2.setHour(10);
        System.out.println("Hello, the time is: " + t2);
        System.out.println("Hello, the time is: " + dt1);
        System.out.println("Checking if t1 is valid: " + t1.isValid());
        System.out.println("Checking if t2 is valid: " + t2.isValid());
        System.out.println("Checking if t3 is valid: " + t3.isValid());
        System.out.println("Checking if t4 is valid: " + t4.isValid());
        System.out.println("Checking if t5 is valid: " + t5.isValid());
        
        System.out.println("Checking if dt1 is valid: " + dt1.isValid());
        System.out.println("Checking if dt2 is valid: " + dt2.isValid());
    }
}
