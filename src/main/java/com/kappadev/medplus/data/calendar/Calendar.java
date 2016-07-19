/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author tburzynski
 */
public class Calendar {
    
    private Date date;
    private java.util.Calendar calendar;
    
    public Date getDate(){
        date = new Date();
        return date;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    
    public String getFormattedDate(String format, Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return  sdf.format(date);
    }
    
    /**
     * 
     * @param date
     * @param value +1 next -1 previous
     * @param dateOption Calendar.MONTH, CALENDAR.YEAR. CALENDAR.DAY
     * @return 
     */
    
    public Date getYear(Date date, int value, int dateOption){
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(date);
        int nextYear = cal.get(java.util.Calendar.YEAR)+value;
        int currentMonth = cal.get(java.util.Calendar.MONTH);
        int currentDay = cal.get(java.util.Calendar.DAY_OF_MONTH);
        cal.set(nextYear, currentMonth, currentDay);
        return cal.getTime();
    }
    
}
