/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author RyanMunguia
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Student example = new Student();
        Animal Charlie = new Animal();
        
        Charlie.setName("Charlie");
        Charlie.setAge(1);
        Charlie.setType("Dog");
        Charlie.setSpeak("Bark Bark Bark");
        
        System.out.println("The animal's name is: " + Charlie.getName());
        System.out.println("The animal's age is: " + Charlie.getAge());
        System.out.println("The animal's type is: " + Charlie.getType());
        System.out.println("Your animal says: " + Charlie.speak());
        
        
        /* Can't do this!
        example.firstName = "John";
        example.id = 123;
        */
        
        //example.setFirstName("John");
        //System.out.println(example.getFirstName());
        /*
        if (example.setId(123) == false)
            System.out.println("That ID already exists");
        else
            System.out.println("Good to go");
        */
    }
    
}
