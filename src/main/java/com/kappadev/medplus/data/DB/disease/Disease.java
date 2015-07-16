package com.kappadev.medplus.data.DB.disease;

import com.kappadev.medplus.data.DB.disease2patientLog.Disease2PatientLog;
import static com.kappadev.medplus.data.DB.disease2patientLog.QDisease2PatientLog.disease2PatientLog;
import com.kappadev.medplus.data.PatientLog.PatientLog;
import java.io.Serializable;
import java.util.List;
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
@Table(name = "DISEASES")
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patientLogId")
    private PatientLog patientLog;

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
