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
public class Square extends Shape
{
    private double side;
    
    public Square()
    {
        side = 0.0;
    }
    
    public Square(double s)
    {
        side = s;
    }
    
    @Override
    public double calculateArea()
    {
        return side * side;
    }
}
