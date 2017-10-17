/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

    For the Time class
    Create integer hour, minute and second
    Set/get methods for each property
    1 default 1 constructor of for all 3 integers
    A predicate method for “isValid” to make sure hour, minute and second are in 
    the proper ranges (hour from 0-23, minute and second from 0-59)

 */
package exercise.pkg4;

/**
 *
 * @author RyanMunguia
 */
public class Time 
{
    private int hour;
    private int minute;
    private int second;
    
    public Time()
    {
        hour = -1;
        minute = -1;
        second = -1;
    }
    
    public Time(int h)
    {
        hour = h;
        minute = -1;
        second = -1;
    }
    
    public Time(int h, int m)
    {
        hour = h;
        minute = m;
        second = -1;
    }
    
    public Time(int h, int m, int s)
    {
        hour = h;
        minute = m;
        second = s;
    }
            
    
    public void setHour(int h)
    {
        hour = h;
    }
    
    public int getHour()
    {
        return hour;
    }
    
    public void setMinute(int m)
    {
        minute = m;
    }
    
    public int getMinute()
    {
        return minute;
    }
    
    public void setSecond(int s)
    {
        second  = s;
    }
    
    public int getSecond()
    {
        return second;
    }
    
    // A predicate method for “isValid” to make sure hour, minute and second are in 
    //the proper ranges (hour from 0-23, minute and second from 0-59)
   public boolean isValid()
   {
       return(((second >= 0 && second <= 60) && (minute >= 0 && minute <= 60)) && (hour >= 0 && hour <= 23));
   }
   /*
   public boolean isValid(int s, int m, int h)
   {
       return(((s >= 0 && s <= 60) && (m >= 0 && m <= 60)) && (h >= 0 && h <= 23));
   }
   */
   
  
}
