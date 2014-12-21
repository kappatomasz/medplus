/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.DB.DISEASE.repository.impl;

import com.kappadev.medplus.data.DB.DISEASE.entity.Disease;
import com.kappadev.medplus.data.DB.DISEASE.repository.DiseaseCustomRepository;
import com.kappadev.medplus.data.Patient.entity.Patient;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author tburzynski
 */
public class DiseaseRepositoryImpl implements DiseaseCustomRepository{

    @Autowired
    EntityManager entityManager;
    

    @Override
    public void addDiseaseToPatient(Disease disease, Patient patient) {
        
    }
    
}
