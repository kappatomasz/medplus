/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.Patient.repository;

import com.kappadev.medplus.data.Patient.entity.Patient;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author tburzynski
 */
public interface PatientRepository extends CrudRepository<Patient, Long>, PatientCustomRepository{
    
}
