/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.data.DB.attachment;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Tomasz
 */
@Entity
@Table(name="Attachment")
public class Attachment implements Serializable {
    private boolean selected;
    private long id;
    private long patient_id;
    private long diseaseId;
    private String contentType;
    private byte[] blob;
    private String fileName;

    /**
     * @return the id
     */
    @Id
    @Column(name="ID", nullable=false, unique=true, precision=11, scale=0)
    @GeneratedValue(strategy=GenerationType.AUTO)
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
     * @return the patient_id
     */
    @Column(name="PATIENT_ID", nullable=false)
    public long getPatient_id() {
        return patient_id;
    }

    /**
     * @param patient_id the patient_id to set
     */
    public void setPatient_id(long patient_id) {
        this.patient_id = patient_id;
    }
    
    public void setDiseaseId(long diseaseId){
        this.diseaseId = diseaseId;
    }
    @Column(name="DISEASE_ID", nullable=false, precision=9, scale=0)
    public long getDiseaseId(){
        return diseaseId;
    }

    /**
     * @return the contentType
     */
    @Column(name="CONTENT_TYPE", length=20, nullable=true)
    public String getContentType() {
        return contentType;
    }

    /**
     * @param contentType the contentType to set
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * @return the blob
     */
    @Column(name="BINARY_DATA", nullable=false)
    public byte[] getBlob() {
        return blob;
    }

    /**
     * @param blob the blob to set
     */
    public void setBlob(byte[] blob) {
        this.blob = blob;
    }

    /**
     * @return the fileName
     */
    @Column(name="FILE_NAME", nullable=false, length=50)
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(fileName);
        return sb.toString();
    }

    /**
     * @return the selected
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
