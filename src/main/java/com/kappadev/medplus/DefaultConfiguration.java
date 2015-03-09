/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus;

import com.kappadev.medplus.ui.MedRegistry;
import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

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
        DataSource dataSource = context.getBean(DataSource.class);
    }
    
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUsername("admin");
        dataSource.setPassword("mysuperpassword");
        dataSource.setUrl("jdbc:h2:~/medRegistryDB;AUTO_SERVER=TRUE");
        return dataSource;
    }
}
