package com.kappadev.medplus.data.PatientLog.service;

import com.kappadev.medplus.data.PatientLog.entity.PatientLog;
import java.util.List;

public interface PatientLogService {

    public void updatePatientLog(PatientLog patientLog);

    public void savePatientLog(PatientLog patientLog);

    public void removePatientLog(PatientLog patientLog);
    
    public void removePatientLogList(List<PatientLog> patientLog);

    public List<PatientLog> getAllPatientsLogs();

}
