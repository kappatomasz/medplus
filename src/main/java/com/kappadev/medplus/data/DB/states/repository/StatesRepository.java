/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.DB.states.repository;

import com.kappadev.medplus.data.DB.states.entity.States;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author tburzynski
 */
public interface StatesRepository extends CrudRepository<States, Long>{
    
}
