/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author RyanMunguia
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time()
    {
        hour = 0;
        minute = 0;
        second = 0;
    }
    
    public Time(int h, int m, int s)
    {
        hour = h;
        minute = m;
        second = s;
    }

    public Time(Time t)
    {
        hour = t.getHour();
        minute = t.getMinute();
        second = t.getSecond();
    }

    public int getHour()
    {
        return hour;
    }
    
    public int getMinute()
    {
        return minute;
    }
    
    public int getSecond()
    {
        return second;
    }

    public void setHour(int h)
    {
        hour = h;
    }
    
    public void setMinute(int m)
    {
        minute = m;
    }
    
    public void setSecond(int s)
    {
        second = s;
    }
    
    public String toString()
    {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}

