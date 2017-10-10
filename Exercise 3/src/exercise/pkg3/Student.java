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
public class Student 
{
    private String first_name;
    private int id;
    private double gpa;
    
    public Student()
    {
        first_name = "";
        id = 0;
        gpa = -1.0;
    }
    
    public Student(String f, int i)
    {
        first_name = f;
        id = i;
        gpa = -1.0;
    }
    
    public Student(String f, int i, double g)
    {
        first_name = f;
        id = i;
        gpa = g;
    }
    
    public void setGpa(double g)
    {
        gpa = g;
    }
    
    public double getGpa()
    {
        return gpa;
    }
    
    public void setFirstName(String f)
    {
        first_name = f;
    }
    
    public void setId(int i)
    {
        id = i;
    }
    
    public String getFirstName()
    {
        return first_name;
    }
    
    public int getId()
    {
        return id;
    }
    
    public boolean isPassing(double passingGpa)
    {
        return (gpa >= passingGpa);
    }
    
    public boolean isPassing()
    {
        return (gpa >= 2.0);
    }

    public boolean hasValidId()
    {
        return (id != 0);
    }
    
    /* You can do this, but only really used
       for debugging purposes.
    */
    public void printName()
    {
        System.out.println(first_name);
    }
}

