/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tomasz
 */
@Component
public class MedRegistry implements CommandLineRunner {
    
    @Autowired
    private MainPanel main;
    
    @Override
    public void run(String... strings) throws Exception {
        main.setVisible(true);
    }

}
