/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.DB.disease.repository;

import com.kappadev.medplus.data.DB.disease.entity.Disease;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author tburzynski
 */
public interface DiseaseRepository extends CrudRepository<Disease, Long>, DiseaseCustomRepository{
    
}
