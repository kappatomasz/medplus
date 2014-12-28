/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.Patient.service.impl;

import com.kappadev.medplus.data.Patient.entity.Patient;
import com.kappadev.medplus.data.Patient.repository.PatientRepository;
import com.kappadev.medplus.data.Patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author tburzynski
 */
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Iterable<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Transactional
    @Override
    public void savePatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Transactional
    @Override
    public void deletePatient(Patient patient) {
        patientRepository.delete(patient);
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findOne(id);
    }

    @Transactional
    @Override
    public void deletePatientList(Iterable<Patient> patientList) {
        patientRepository.delete(patientList);
    }

}
