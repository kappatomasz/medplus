/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.spring;

import com.kappadev.medplus.ui.MedRegistry;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author tburzynski
 */
@Configuration
@ComponentScan({"com.kappadev.medplus"})
@EnableAutoConfiguration
public class DefaultConfiguration {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(DefaultConfiguration.class);
        builder.headless(false);
        ConfigurableApplicationContext context = builder.run(args);
        MedRegistry appFrame = context.getBean(MedRegistry.class);
    }
}
