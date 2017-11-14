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
public class Circle extends Shape
{
    private double radius;
    
    public Circle()
    {
        radius = 0.0;
    }
    
    public Circle(double r)
    {
        radius = r;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    @Override
    public double calculateArea()
    {
        return 3.14159 * radius * radius;
    }
}
