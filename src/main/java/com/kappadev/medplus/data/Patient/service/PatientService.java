/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.Patient.service;

import com.kappadev.medplus.data.Patient.entity.Patient;

/**
 *
 * @author tburzynski
 */
public interface PatientService {

    public Iterable<Patient> getAllPatients();
    
    public void savePatient(Patient patient);
    
    public void deletePatient(Patient patient);
    
    public Patient getPatientById(Long id);
    
    public void deletePatientList(Iterable<Patient> patientList);
}
