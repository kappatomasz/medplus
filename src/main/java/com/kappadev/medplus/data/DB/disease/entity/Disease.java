/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.DB.disease.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 *
 * @author Tomasz
 */
@Entity
@Table(name = "Disease")
public class Disease implements Serializable {

    @Id
    @Column(name = "Id", unique = true, nullable = false, precision = 9, scale = 0)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Lob
    @Column(name = "description", nullable = true)
    private byte[] description;

    @Column(name = "name", length = 500, nullable = false)
    private String name;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
