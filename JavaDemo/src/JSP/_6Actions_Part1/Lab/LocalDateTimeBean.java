package com.ted;

import java.io.Serializable;
import java.util.Calendar;
import java.util.*;

public class LocalDateTimeBean implements Serializable {
	
    private int year,month,day,hour,min,sec;
    Calendar now = Calendar.getInstance();
    
    public void setYear() {
    	this.year = now.get(Calendar.YEAR);
    }
    
    public int getYear() {
    	return this.year;
    }
    
    public void setMonth() {
    	this.month = now.get(Calendar.MONTH);
    }
    
    public int getMonth() {
    	return this.month;
    }
    
    public void setDay() {
    	this.day = now.get(Calendar.DAY_OF_MONTH);
    }
    
    public int getDay() {
    	return this.day;
    }



	
}	
