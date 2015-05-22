/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.DB.disease2patientLog;

import com.kappadev.medplus.data.DB.disease.Disease;
import com.kappadev.medplus.data.PatientLog.PatientLog;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tburzynski
 */
@Service
public class Disease2PatientLogServiceImpl implements Disease2PatientLogService{
    
    @Autowired
    private Disease2PatientLogRepository disease2patientLogRepository;

    @Override
    public List<PatientLog> getPatientLogsByDisease(Disease disease) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public void mapDiseaseToPatientLog(Disease disease, PatientLog patientLog) {
        Disease2PatientLog disease2PatientLog = new Disease2PatientLog();
        disease2PatientLog.setDisease(disease);
        disease2PatientLog.setPatientLog(patientLog);
        disease2patientLogRepository.save(disease2PatientLog);
    }

    @Override
    public void removeDiseaseToPatientLogMapping(Disease disease, PatientLog patientLog) {
        
    }

    @Override
    public List<Disease> getDiseasesByPatientLog(PatientLog patientLog) {
        return disease2patientLogRepository.findAllDiseaseByPatientLogId(patientLog.getId());
    }
    
}
