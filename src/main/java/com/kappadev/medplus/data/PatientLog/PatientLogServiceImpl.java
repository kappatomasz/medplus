package com.kappadev.medplus.data.PatientLog;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PatientLogServiceImpl implements PatientLogService {

    @Autowired
    PatientLogRepository patientLogRepository;

    @Transactional
    @Override
    public void savePatientLog(PatientLog patientLog) {
        patientLogRepository.save(patientLog);
    }

    @Transactional
    @Override
    public void removePatientLog(PatientLog patientLog) {
        patientLogRepository.delete(patientLog);
    }

    @Override
    public List<PatientLog> getAllPatientsLogs() {
        return patientLogRepository.findAll();
    }

    @Transactional
    @Override
    public void updatePatientLog(PatientLog patientLog) {
        PatientLog pLog = patientLogRepository.findOne(patientLog.getId());
        pLog.setModificationDate(patientLog.getModificationDate());
        pLog.setNote(patientLog.getNote());
        patientLogRepository.save(pLog);
    }

    @Transactional
    @Override
    public void removePatientLogList(List<PatientLog> patientLog) {
        patientLogRepository.delete(patientLog);
    }
}
