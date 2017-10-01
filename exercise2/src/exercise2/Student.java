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
public class Student 
{
    private String first_name;
    private int id;
    
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
    
    /* You can do this, but only really used
       for debugging purposes.
    */
    public void printName()
    {
        System.out.println(first_name);
    }
}

