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
public class DateTime {
    private int month;
    private int day;
    private int year;
    private Time time;
    
    public DateTime()
    {
        month = 1;
        day = 1;
        year = 1900;
        time = new Time();
    }
    
    public DateTime(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
        time = new Time();
    }

    public DateTime(int m, int d, int y, Time t)
    {
        month = m;
        day = d;
        year = y;
        time = new Time(t);
    }

    public DateTime(DateTime d)
    {
        month = d.getMonth();
        day = d.getDay();
        year = d.getYear();
        time = new Time(d.getTime());
    }

    public DateTime(int m, int d, int y, int h, int min, int s)
    {
        month = m;
        day = d;
        year = y;
        time = new Time(h, min, s);
    }

    public int getMonth()
    {
        return month;
    }
    
    public int getDay()
    {
        return day;
    }
    
    public int getYear()
    {
        return year;
    }

    public int getHour()
    {
        return time.getHour();
    }
    
    public int getMinute()
    {
        return time.getMinute();
    }
    
    public int getSecond()
    {
        return time.getSecond();
    }

    public Time getTime()
    {
        return new Time(time);
    }

    public void setMonth(int m)
    {
        month = m;
    }

    public void setDay(int d)
    {
        day = d;
    }

    public void setYear(int y)
    {
        year = y;
    }

    public void setHour(int h)
    {
        time.setHour(h);
    }

    public void setMinute(int m)
    {
        time.setMinute(m);
    }

    public void setSecond(int s)
    {
        time.setSecond(s);
    }

    public void setTime(Time t)
    {
        time.setHour(t.getHour());
        time.setMinute(t.getMinute());
        time.setSecond(t.getSecond());
    }

    public String toString()
    {
        return String.format("%02d/%02d/%04d %s", month, day, year, time);
    }
}

