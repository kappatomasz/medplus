/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus;

import com.kappadev.medplus.ui.MedRegistry;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

/**
 *
 * @author tburzynski
 */
@ComponentScan
@EnableSpringDataWebSupport
@EnableAutoConfiguration
//public class DefaultConfiguration extends SpringBootServletInitializer implements WebApplicationInitializer{
public class DefaultConfiguration extends javax.swing.JFrame {

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        
//        application.headless(true);
//        application.main(DefaultConfiguration.class);
//        return application.sources(DefaultConfiguration.class);
//    }
    public static void main(String[] args) {
//         = SpringApplication.run(DefaultConfiguration.class, args);
        ConfigurableApplicationContext context = new SpringApplicationBuilder(DefaultConfiguration.class).web(false).headless(false).run(args);
//        builder.headless(false);
//        ConfigurableApplicationContext context = builder.run(args);
        String[] beans = context.getBeanDefinitionNames();
        MedRegistry appFrame = context.getBean(MedRegistry.class);
    }
}
