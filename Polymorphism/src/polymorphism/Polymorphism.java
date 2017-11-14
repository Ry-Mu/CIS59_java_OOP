/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author RyanMunguia
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Shape s = new Circle(5.0);
        Circle c = new Circle(4.3);
        
        System.out.println(c.calculateArea());
        System.out.println(s.calculateArea());
        
        Rectangle r = new Rectangle(2, 3);
        System.out.println(r.calculateArea());

        Shape s2 = new Rectangle(4, 5);
        System.out.println(s2.calculateArea());
        
        Shape[] shapes = new Shape[15];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Square(3.5);
        shapes[2] = new Rectangle(4, 2);
        shapes[3] = new Circle(4.0);
        int numberOfShapes = 4;
        
        double sum = 0.0;
        for (int index = 0; index < numberOfShapes; index++)
        {
            sum += shapes[index].calculateArea();
            System.out.println(shapes[index].calculateArea());
        }
        System.out.println(sum);
        
    }
    
}

