package com.kappadev.medplus.data.Patient;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.kappadev.medplus.data.Patient.PatientSpecifications.cityIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.flatNoIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.houseNoIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.peselIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.nameIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.phoneIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.postCodeIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.secondNameIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.stateEq;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.diseaseIn;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.streetIsLike;
import static com.kappadev.medplus.data.Patient.PatientSpecifications.surnameIsLike;
import com.kappadev.medplus.data.PatientLog.PatientLog;
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
    public void removePatientList(List<Patient> patientList) {
        patientRepository.delete(patientList);
    }

    @Override
    public List<Patient> getFilteredPatients(Patient patient) {
        return patientRepository.findAll(where(cityIsLike(patient.getCity()))
                //TODO fix this                .or(diseaseIsLike(patient.getDisease().toString()))
                .or(flatNoIsLike(patient.getFlat()))
                .or(houseNoIsLike(patient.getHouseNo()))
                .or(peselIsLike(Long.toString(patient.getId())))
                .or(nameIsLike(patient.getName()))
                .or(phoneIsLike(patient.getPhone()))
                .or(postCodeIsLike(patient.getPostCode()))
                .or(secondNameIsLike(patient.getSecondName()))
                .or(stateEq(patient.getState()))
                .or(streetIsLike(patient.getStreet()))
                .or(surnameIsLike(patient.getSurname()))
                .or(diseaseIn(patient.getPatientLog().getDiseases()))
        );
    }

    @Transactional
    @Override
    public void addPatientLogToPatient(PatientLog patientLog, Patient patient) {
        Patient pat = patientRepository.findOne(patient.getId());
        pat.setPatientLog(patientLog);
        patientRepository.save(pat);
    }

    @Override
    public PatientLog getPatientLogByPatientId(Long id) {
        Patient pat = patientRepository.findOne(id);
        return pat.getPatientLog();
    }
}
