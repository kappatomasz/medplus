/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.DB.event;

import java.util.Date;

/**
 *
 * @author tburzynski
 */
public class Event {
    
    private Long id;
    private Date date;
    private String eventDescription;
    private String eventTitle;
    private Long peselId;
    
    public Long getId(){
        return id;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    
    public Date getDate(){
        return date;
    }
    
    public void setEventDescription(String description){
        this.eventDescription = description;
    }
    
    public String getEventDescription(){
        return eventDescription;
    }
    
    public void setEventTitle(String eventTitle){
        this.eventTitle = eventTitle;
    }
    
    public String getEventTitle(){
        return eventTitle;
    }
    
    public void setPeselId(Long peselId){
        this.peselId = peselId;
    }
    
    public Long getPeselId(){
        return peselId;
    }
}
