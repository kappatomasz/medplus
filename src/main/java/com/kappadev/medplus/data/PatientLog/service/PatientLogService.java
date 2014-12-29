package com.kappadev.medplus.data.PatientLog.service;

import com.kappadev.medplus.data.PatientLog.entity.PatientLog;

public interface PatientLogService {

    public void savePatientLog(PatientLog patientLog);

    public void removePatientLog(PatientLog patientLog);

    public Iterable<PatientLog> getAllPatientsLogs();

    public PatientLog getPatientLogWithPatientId(Long id);
}
