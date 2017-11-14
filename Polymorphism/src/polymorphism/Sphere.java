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
public class Sphere extends ThreeDimShape
{
    private double radius;
    
    public Sphere()
    {
        radius = 0.0;
    }
    
    public Sphere(double r)
    {
        radius = r;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    @Override
    public double calculateVolume()
    {
        
        return (radius * radius * radius) *(4/3) * 3.14;
    }
    
    @Override
    public double calculateSA()
    {
        return 4 * 3.14 * (radius * radius);
    }
}
