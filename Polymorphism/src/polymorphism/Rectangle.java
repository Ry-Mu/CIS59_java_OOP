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
public class Rectangle extends Shape
{
    private double length;
    private double width;
    
    public Rectangle()
    {
        length = 0.0;
        width = 0.0;
    }

    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }
    
    @Override
    public double calculateArea()
    {
        return length * width;
    }
}
