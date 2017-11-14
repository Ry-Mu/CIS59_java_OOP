/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.util.Scanner;

/**
 *
 * @author RyanMunguia
 */
public class Cone extends ThreeDimShape
{

   private double radius;
   
   private double radiusCubed = (radius * radius * radius);
   
   private double height;
   
   public Cone()
    {
        radius = 0.0;
        height = 0.0;
    }
    
    public Cone(double r, double h)
    {
        radius = r;
        height = h;
    }
    
    @Override
    public double calculateVolume()
    {
        return (3.14 * (radiusCubed) * height) / 3;
        //still need to square the radius cubed and pie equation
        
    }
    
    @Override
    public double calculateSA()
    {
        return 1.0;
    }
    
}
