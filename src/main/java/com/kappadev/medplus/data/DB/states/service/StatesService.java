/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.DB.states.service;

import com.kappadev.medplus.data.DB.states.entity.States;
import java.util.List;

/**
 *
 * @author tburzynski
 */
public interface StatesService {
    
    public List<States> getAllStates();
    
}
