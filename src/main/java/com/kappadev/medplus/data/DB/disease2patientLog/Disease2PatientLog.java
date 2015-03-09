/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.DB.disease2patientLog;

import com.kappadev.medplus.data.DB.disease.entity.Disease;
import com.kappadev.medplus.data.PatientLog.entity.PatientLog;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author tburzynski
 */
@Entity
@Table(name = "DISEASE_TO_PATIENT_LOG")
public class Disease2PatientLog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "diseaseId", nullable = false)
    private Disease disease;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patientLogId", nullable = false)
    private PatientLog patientLog;

    public Disease2PatientLog() {

    }

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
     * @return the disease
     */
    public Disease getDisease() {
        return disease;
    }

    /**
     * @param disease the disease to set
     */
    public void setDisease(Disease disease) {
        this.disease = disease;
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
