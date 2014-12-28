/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.DB.DISEASE.repository;

import com.kappadev.medplus.data.DB.DISEASE.entity.Disease;
import com.kappadev.medplus.data.Patient.entity.Patient;

/**
 *
 * @author tburzynski
 */
public interface DiseaseCustomRepository {

    public void setDiseaseToPatient(Disease disease, Patient patient);

}
