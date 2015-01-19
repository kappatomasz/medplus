/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.Patient.service.impl;

import com.kappadev.medplus.data.Patient.entity.Patient;
import com.kappadev.medplus.data.Patient.repository.PatientRepository;
import com.kappadev.medplus.data.Patient.service.PatientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.kappadev.medplus.data.Patient.PatientSpecifications.cityIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.diseaseIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.flatNoIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.houseNoIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.idIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.nameIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.phoneIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.postCodeIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.secondNameIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.stateIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.streetIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.surnameIsLike;
import static org.springframework.data.jpa.domain.Specifications.where;

/**
 *
 * @author tburzynski
 */
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Transactional
    @Override
    public void savePatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Transactional
    @Override
    public void removePatient(Patient patient) {
        patientRepository.delete(patient);
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findOne(id);
    }

    @Transactional
    @Override
    public void removePatientList(Iterable<Patient> patientList) {
        patientRepository.delete(patientList);
    }

    @Override
    public List<Patient> getFilteredPatients(Patient patient) {
        return patientRepository.findAll(where(cityIsLike(patient.getCity()))
                .or(diseaseIsLike(patient.getDisease().toString()))
                .or(flatNoIsLike(patient.getFlat()))
                .or(houseNoIsLike(patient.getHouseNo()))
                .or(idIsLike(Long.toString(patient.getId())))
                .or(nameIsLike(patient.getName()))
                .or(phoneIsLike(patient.getPhone()))
                .or(postCodeIsLike(patient.getPostCode()))
                .or(secondNameIsLike(patient.getSecondName()))
                .or(stateIsLike(patient.getState().toString()))
                .or(streetIsLike(patient.getStreet()))
                .or(surnameIsLike(patient.getSurname()))
        );
    }
}
