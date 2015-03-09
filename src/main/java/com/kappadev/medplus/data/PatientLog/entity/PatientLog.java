/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.data.PatientLog.entity;

import com.kappadev.medplus.data.DB.attachment.entity.Attachment;
import com.kappadev.medplus.data.DB.disease.entity.Disease;
import com.kappadev.medplus.data.DB.disease2patientLog.Disease2PatientLog;
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
    
    @OneToMany(mappedBy = "patientLog")
    private List<Disease2PatientLog> disease2PatientLogList;
    
    @Column(name = "note", nullable = true)
    private String note;
    
    @Column(name = "modificationDate", nullable = false)
    private Date modificationDate; 
    
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "patientLog")
    private Patient patient;
    
    @OneToMany(mappedBy = "patientLog")
    private List<Attachment> attachmentList;
    
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

    /**
     * @return the attachmentList
     */
    public List<Attachment> getAttachmentList() {
        return attachmentList;
    }

    /**
     * @param attachmentList the attachmentList to set
     */
    public void setAttachmentList(List<Attachment> attachmentList) {
        this.attachmentList = attachmentList;
    }

    /**
     * @return the disease2PatientLogList
     */
    public List<Disease2PatientLog> getDisease2PatientLogList() {
        return disease2PatientLogList;
    }

    /**
     * @param disease2PatientLogList the disease2PatientLogList to set
     */
    public void setDisease2PatientLogList(List<Disease2PatientLog> disease2PatientLogList) {
        this.disease2PatientLogList = disease2PatientLogList;
    }

}
