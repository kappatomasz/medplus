package com.kappadev.medplus.data.PatientLog.service;

import com.kappadev.medplus.data.PatientLog.entity.PatientLog;
import com.kappadev.medplus.data.PatientLog.repository.PatientLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class PatientLogServiceImpl implements PatientLogService {

    @Autowired
    PatientLogRepository patientLogRepository;

    @Transactional
    @Override
    public void savePatientLog(PatientLog patientLog) {
        patientLogRepository.save(patientLog);
    }

    @Override
    public void removePatientLog(PatientLog patientLog) {
        patientLogRepository.delete(patientLog);
    }

    @Override
    public Iterable<PatientLog> getAllPatientsLogs() {
        return patientLogRepository.findAll();
    }

    @Override
    public PatientLog getPatientLogWithPatientId(Long id) {
        return patientLogRepository.findOne(id);
    }
}
