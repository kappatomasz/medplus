package com.kappadev.medplus.data.PatientLog;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author tburzynski
 */
public interface PatientLogRepository extends JpaRepository<PatientLog, Long> {

    public PatientLog findPatientLogByPatientId(Long patientId);
}
