/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg3;

/**
 *
 * @author RyanMunguia
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Student example = new Student();
        
        GroceryItem apple = new GroceryItem();
        apple.setName("Apple");
        apple.setPrice(1.0);
        apple.setExpirationDate("October 15");
        
        System.out.println(apple.getPrice());
        System.out.println("Is the apple expensive? " + apple.isExpensive());
        
        System.out.println("Does the apple have an expiration date? " +apple.hasExpiration());
        
 
        GroceryItem steak = new GroceryItem("Steak", 10.0, "October 12");
        
        System.out.println("Is the steak expensive? " + steak.isExpensive(5.0));
        
        System.out.println("Does the steak have an expiration date? " + steak.hasExpiration());
        
        System.out.println("test");
        
        
        /* Can't do this!
        example.firstName = "John";
        example.id = 123;
        */
        
        example.setFirstName("John");
        System.out.println(example.getFirstName());
        /*
        if (example.setId(123) == false)
            System.out.println("That ID already exists");
        else
            System.out.println("Good to go");
        */
        
        Student s1 = new Student("Frank", 45);
        System.out.println(s1.getFirstName() + ":" + s1.getId());
    }
    
}