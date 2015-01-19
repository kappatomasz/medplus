/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.Patient.repository;

import com.kappadev.medplus.data.DB.disease.entity.Disease;
import com.kappadev.medplus.data.Patient.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author tburzynski
 */
public interface PatientCustomRepository extends JpaRepository<Patient, Long>, JpaSpecificationExecutor<Patient> {

    public void setDiseaseToPatient(Disease disease, Patient patient);

}
