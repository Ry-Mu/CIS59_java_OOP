/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

/**
 *
 * @author RyanMunguia
 */
public class Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // For exercise 5, at minimum, make this
        // code work by completing the Gradebook
        // and Student class code
        
	Gradebook g = new Gradebook("CIS059");
	Student s = new Student(113, "Phil Tayco", 84.3);
	g.addStudent(111, "John Smith", 93.2);
	g.addStudent(112, "Jane Doe", 76.8);
	g.addStudent(s);
        
        System.out.println(g);
        System.out.println(s);
        System.out.println(g.getCourse());
        
        System.out.println(s.getName());
        System.out.println(g.getCourse());
        
        System.out.println(g.getRosterLength());
        System.out.println(g.getStudent(111));
        System.out.println(g.exists(112));
        
        
        if (g.exists(112))
            System.out.println(g.getStudent(112));

	if (g.removeStudent(111))
          System.out.println("Student removed");
        System.out.println(g.getStudent(113));

	g.setGrade(113, 95.5);
        System.out.println(g.getStudent(113));
        //System.out.println(s.getGrade());
        
        //Add other code in main as you like to
        //test more functionality with Gradebook
    }
    
}
