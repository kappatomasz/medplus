/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.DB.attachment;

import com.kappadev.medplus.data.PatientLog.PatientLog;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Tomasz
 */
@Entity
@Table(name = "ATTACHMENT")
public class Attachment implements Serializable {

    private boolean selected;

    @Id
    @Column(name = "Id", nullable = false, unique = true, precision = 11, scale = 0)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patientLogId")
    private PatientLog patientLog;

    @Column(name = "contentType", nullable = true, length = 50)
    private String contentType;

    @Lob
    @Column(name = "content", nullable = true)
    private byte[] blob;

    @Column(name = "fileName", nullable = true)
    private String fileName;

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
     * @return the contentType
     */
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
    public String toString() {
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

    /**
     * @return the patientLog
     */
    public PatientLog getPatientLog() {
        return patientLog;
    }

    /**
     * @param patientLog the patientLog to set
     */
    public void setPatientLog(PatientLog patientLog) {
        this.patientLog = patientLog;
    }
}
