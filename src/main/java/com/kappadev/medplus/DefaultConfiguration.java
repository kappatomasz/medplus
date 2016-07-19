/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus;

import com.kappadev.medplus.ui.MedRegistry;
import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author tburzynski
 */
@SpringBootApplication
public class DefaultConfiguration extends javax.swing.JFrame {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(DefaultConfiguration.class).web(false).headless(false).run(args);
        String[] beans = context.getBeanDefinitionNames();
        MedRegistry appFrame = context.getBean(MedRegistry.class);
        DataSource dataSource = context.getBean(DataSource.class);
    }
}
