package com.kappadev.medplus.data.PatientLog;

import com.kappadev.medplus.data.DB.attachment.Attachment;
import com.kappadev.medplus.data.DB.disease.Disease;
import com.kappadev.medplus.data.Patient.Patient;
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
@Table(name = "PATIENT_LOG")
public class PatientLog implements Serializable {

    @Id
    @Column(name = "Id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "patientLog")
    private List<Disease> diseases;

    @Column(name = "note", nullable = true)
    private String note;

    @Column(name = "modificationDate", nullable = false)
    private Date modificationDate;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "patientLog")
    private Patient patient;

    @OneToMany(mappedBy = "patientLog")
    private List<Attachment> attachmentList;

    public PatientLog() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public Date getModificationDate() {
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
     * @return the diseases
     */
    public List<Disease> getDiseases() {
        return diseases;
    }

    /**
     * @param diseases the diseases to set
     */
    public void setDiseases(List<Disease> diseases) {
        this.diseases = diseases;
    }

}
