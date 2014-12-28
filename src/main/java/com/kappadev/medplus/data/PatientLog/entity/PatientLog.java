/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.data.PatientLog.entity;

import java.util.Date;

/**
 *
 * @author Tomasz
 */

public class PatientLog {
    private Long id;
    private Long peselId;
    private String note;
    private Date modificationDate; 
    
    public PatientLog(){
        
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    public Long getId(){
        return id;
    }
    
    public void setPeselId(Long peselId){
        this.peselId = peselId;
    }
    
    public Long getPeselId(){
        return peselId;
    }
    
    public void setNote(String note){
        this.note = note;
    }
    
    public String getNote(){
        return note;
    }
    
    public void setModificationDate(Date modificationDate){
        this.modificationDate = modificationDate;
    }
    
    public Date getModificationDate(){
        return modificationDate;
    }
}
