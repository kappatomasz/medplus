/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.data.PatientLog.entity;

import com.kappadev.medplus.data.DB.disease.entity.Disease;
import com.kappadev.medplus.data.Patient.entity.Patient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Tomasz
 */
@Entity
@Table(name = "PatientLog")
public class PatientLog implements Serializable {
    
    @Id
    @Column(name = "Id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "disease", referencedColumnName = "Id", nullable = true)
    private List<Disease> diseaseList;
    
    @Column(name = "note", nullable = true)
    private String note;
    
    @Column(name = "modificationDate", nullable = false)
    private Date modificationDate; 
    
    @OneToOne(mappedBy = "patientLog")
    private Patient patient;
    
    public PatientLog(){
        
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    public Long getId(){
        return id;
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

    /**
     * @return the disease
     */
    public List<Disease> getDiseaseList() {
        return diseaseList;
    }

    /**
     * @param disease the disease to set
     */
    public void setDiseasesList(List<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }

    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

}
