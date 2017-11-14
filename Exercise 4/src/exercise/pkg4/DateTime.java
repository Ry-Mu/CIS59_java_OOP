/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

    For the DateTime class
    Create integer month, day, year properties
    Create Time time property
    Set/get methods for each property
    1 default constructor
    1 constructor with 6 integers for month, day, year, hour, minute and seconds
    1 constructor with 3 integers for month day and year and a Time object t that creates a separate time object
    Use the isValid function in Time appropriately

 */
package exercise.pkg4;

/**
 *
 * @author RyanMunguia
 */
public class DateTime 
{
    private int month;
    private int day;
    private int year;
    private Time time;
    
    public DateTime()
    {
        month = -1;
        day = -1;
        year = -1;
        time = null;
    }
    public DateTime(int mo, int d, int y, int h, int m, int s)
    {
       month = mo;
       day = d;
       year = y;
       time = new Time(h,m,s);
        
    }
    
    public DateTime(int mo, int d, int y, Time t)
    {
        month = mo;
        day = d;
        year = y;
        time = new Time(t.getHour(), t.getMinute(), t.getSecond()); 
    }
    
    
    public void setMonth(int m)
    {
        month = m;
    }
    
    public int getMonth()
    {
        return month;
    }
    
    public void setDay(int d)
    {
        day = d;
    }
    
    public int getDay()
    {
        return day;
    }
    
    public void setYear(int y)
    {
        year = y;
    }
    
    public int getYear()
    {
        return year;
    }
    
   public void setTime(int h, int m, int s)
   {
       time.setHour(h);
       time.setMinute(m);
       time.setSecond(s);
   }
   
   public void setTime(Time t)
   {
       time.setHour(t.getHour());
       time.setMinute(t.getMinute());
       time.setSecond(t.getSecond());
   }
   
   public void getTime()
   {
       time.getHour();
       time.getMinute();
       time.getSecond();
   }
/*
   public void getTime(Time t)
   {
       time.getHour(t.getHour());
       time.getMinute(t.getMinute());
       time.getSecond(t.getSecond());
   }
*/
   public boolean isValid()
   {
       return (month <= 12 && time.isValid());
   }
}
