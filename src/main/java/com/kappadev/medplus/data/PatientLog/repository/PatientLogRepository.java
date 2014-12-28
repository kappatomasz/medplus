/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.PatientLog.repository;

import com.kappadev.medplus.data.PatientLog.entity.PatientLog;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author tburzynski
 */
public interface PatientLogRepository extends CrudRepository<PatientLog, Long> {

    public PatientLog findPatientLogByPatientId(Long patientId);
}
