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
public class Student 
{
    private int id;
    private String name;
    private double grade;
    
    // Complete the constructors, set/get functions
    // toString and anything else to support the main
    // program code
    
    public Student()
    {
        id = -1;
        name = "";
        grade = -1;
    }
    
    public Student(int i)
    {
        id = i;
        name = "";
        grade = -1;
    }
    
    public Student(int i, String s)
    {
        id = i;
        name = s;
        grade = -1;
    }
    
    public Student(int i, String s, double g)
    {
        id = i;
        name = s;
        grade = g;
    }
    
    public void setId(int i)
    {
        id = i;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setGrade(double g)
    {
        grade = g;
    }
    
    
    public double getGrade()
    {
        return grade;
    }
    
    
    public String toString()
    {
        return String.format("%d:%s:%f", id, name, grade);
    }
   
}
