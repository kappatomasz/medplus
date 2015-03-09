/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.DB.disease2patientLog;

import com.kappadev.medplus.data.DB.disease.entity.Disease;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author tburzynski
 */
public interface Disease2PatientLogRepository extends JpaRepository<Disease2PatientLog, Serializable> {

    public List<Disease> findAllDiseaseByPatientLogId(Long id);

    public Disease2PatientLog findDisease2PatientLogByDiseaseIdAndPatientLogId(Long diseaseId, Long patientLogId);
}
