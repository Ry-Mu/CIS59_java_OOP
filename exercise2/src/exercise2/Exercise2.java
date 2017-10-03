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
        Animal Pepper = new Animal();
        Animal Lucy = new Animal("Lucy", 2, "Dog", "Bark Bark Bark");
        
        Charlie.setName("Charlie");
        Charlie.setAge(1);
        Charlie.setType("Dog");
        Charlie.setSpeak("Bark Bark Bark");
        
        Pepper.setName("Pepper");
        Pepper.setAge(4);
        Pepper.setType("Cat");
        Pepper.setSpeak("Meow Meow Meow");
        
        System.out.println("The animal's name is: " + Charlie.getName());
        System.out.println("The animal's age is: " + Charlie.getAge());
        System.out.println("The animal's type is: " + Charlie.getType());
        System.out.println("Your animal says: " + Charlie.speak());
        
        System.out.println("***************************************");
        
        System.out.println("The animal's name is: " + Pepper.getName());
        System.out.println("The animal's age is: " + Pepper.getAge());
        System.out.println("The animal's type is: " + Pepper.getType());
        System.out.println("Your animal says: " + Pepper.speak());
        
        System.out.println("***************************************");
        
        System.out.println("The animal's name is: " + Lucy.getName());
        System.out.println("The animal's age is: " + Lucy.getAge());
        System.out.println("The animal's type is: " + Lucy.getType());
        System.out.println("Your animal says: " + Lucy.speak());
        
        
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
