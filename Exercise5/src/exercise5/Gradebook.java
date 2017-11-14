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
public class Gradebook 
{
    private int numberOfStudents;
    private String courseName;
    private Student[] roster;
    
    // Complete the constructors, addStudent,
    // removeStudent, exists, getStudent and
    // setGrade methods to support the main program
    
    // Challenge: write a function that returns
    // the average grade of all Students currently
    // in the Gradebook roster
    
    public Gradebook()
    {
        numberOfStudents = 0;
        courseName = "";
        roster = new Student[50];
        for (int c = 0; c < 50; c++)
            roster[c] = new Student();
    }
    
    public Gradebook(String c)
    {
        numberOfStudents = 0;
        courseName = c;
        roster = new Student[50];
        for (int i = 0; i < 50; i++)
            roster[i] = new Student();
    }
    
    public Gradebook(String c, int n)
    {
        courseName = c;
        numberOfStudents = n;
        roster = new Student[n];
        for (int i = 0; i < 50; i++)
            roster[i] = new Student();
    }
    public void setCourse(String c)
    {
        courseName = c;
    }
    
    public String getCourse()
    {
        return courseName;
    }
   
    
    //public void setRoster(Student[] r)
    //{
        
    //}
    
    public void addStudent()
    {
        roster[numberOfStudents++] = new Student();
        numberOfStudents ++;
    }
    public void addStudent(int i)
    {
        roster[numberOfStudents++] = new Student(i);
        numberOfStudents ++;
    }
    public void addStudent(int i, String n)
    {
        roster[numberOfStudents++] = new Student(i,n);
        numberOfStudents ++;
    }
    
    public void addStudent(int i, String n, double g)
    {
        roster[numberOfStudents++] = new Student(i,n,g);
        numberOfStudents ++;
    }
    
    public void addStudent(Student s)
    {
        roster[numberOfStudents++] = s;
        numberOfStudents ++;
    }
    
    public int getRosterLength()
    {
        return roster.length;
    }
    
     public int getRoster()
    {
        return roster.length;
    }
     
     public String getStudent(int i)
     {
         for (int c = 0; c < roster.length; c++)
             {
                 if (roster[c].getId() == i)
                     return (roster[c].getName() + " " + roster[c].getGrade());
             }
         return("Got the student");
     }
                            
         
     public boolean exists(int i)
     {
        for (int c = 0; c < roster.length; c++)
        {
            if (roster[c].getId() == i)
                return true;
        }
        return false;
     }
     /*
     public Student getStudent(int i)
     {
        if (exists(i))
        {
             for (int c = 0; c < roster.length; c++)
             {
                 if (roster[c].getId() == i)
                 {
                     roster[c].getName();
                     roster[c].getGrade();
                 }
             }
         } return roster[c].getName();
             //return ("Found the student");
            //return String.format("Student name is %s ", roster[i].getName());
         //return ("Student does not exist");
     } 
     */

    public boolean removeStudent(int i)
    {
        if (exists(i))
        {
            for (int c = 0; c < roster.length; c++)
            {
                if (roster[c].getId() == i)
                    roster[c].setId(-1);
                //System.out.println("Student removed");
                return true;
            }
            //roster[i] = null;
            //numberOfStudents -= 1;
            return true;
        }
        return true;
    } 
    /*
    public boolean setGrade(int i, double d)
    {
        if (exists(i))
        {
            for (int c = 0; c < roster.length; c++)
        {
            if (roster[c].getId() == i)
                roster[c].setGrade(d);
            System.out.println("Grade Changed successfully");
            return true;
        }
            return true;
            //return String.format("Grafe for %s has been changed.", roster[i].getName());
        }
        //return String.format("Student id# %06d isn't enrolled in %s", i, getCourse());
        return false;
    }
*/
    public boolean setGrade(int i, double d)
    {
        for (int c = 0; c < roster.length; c++)
        {
            if (roster[c].getId() == i)
                roster[c].setGrade(d);
        }
        System.out.println("Grade Changed successfully");
        return true;
    }
  
}