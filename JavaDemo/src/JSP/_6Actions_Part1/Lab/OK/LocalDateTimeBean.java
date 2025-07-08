package com.ted;

import java.io.Serializable;
import java.time.LocalDateTime;

public class LocalDateTimeBean implements Serializable {
	
    private int year,month,day,hour,min,sec;
    
    LocalDateTime ldt = LocalDateTime.now();
    
	public int getYear(){
		
	    year=ldt.getYear(); 
		return year;
	}
	public int getMonth(){
		
	    month = ldt.getMonthValue(); 
		return month;
	}
	public int getDay(){
		
	    day = ldt.getDayOfMonth(); 
		return day;
	}
	public int getHour(){
		
	    hour = ldt.getHour(); 
		return hour;
	}
	public int getMin(){
		
	    min = ldt.getMinute(); 
        return min;
	}
	public int getSec(){
		
	    sec = ldt.getSecond(); 
		return sec;
	}
/*
    public static void main(String args[])
    {
        //Local date time instance
        LocalDateTimeBean date = new LocalDateTimeBean();
        
        System.out.println("==========================");
        System.out.println("¦~: "+date.getYear()); 
        System.out.println("¤ë: "+date.getMonth());
        System.out.println("¤é: "+date.getDay());   
        System.out.println("==========================");            
    }
*/	
}	
