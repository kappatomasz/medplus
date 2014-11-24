/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.data.DB.DISEASE;

/**
 *
 * @author Tomasz
 */
public class Disease {
    private long id;
    private byte[] description;
    private String name;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public byte[] getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(byte[] description) {
        this.description = description;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
