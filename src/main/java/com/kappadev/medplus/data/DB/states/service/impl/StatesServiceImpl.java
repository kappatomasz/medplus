/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.DB.states.service.impl;

import com.kappadev.medplus.data.DB.states.entity.States;
import com.kappadev.medplus.data.DB.states.repository.StatesRepository;
import com.kappadev.medplus.data.DB.states.service.StatesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tburzynski
 */
@Service
public class StatesServiceImpl implements StatesService{

    @Autowired
    private StatesRepository statesRepository;

    @Override
    public List<States> getAllStates() {
        return statesRepository.findAll();
    }

}
