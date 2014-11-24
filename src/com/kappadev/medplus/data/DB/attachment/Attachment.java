/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.data.DB.attachment;

/**
 *
 * @author Tomasz
 */
public class Attachment {
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
    
    public long getDiseaseId(){
        return diseaseId;
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
