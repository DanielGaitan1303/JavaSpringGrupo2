package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class BeanConfig {

    @Lazy
    @Bean("manualExperimentService")
    public ExperimentService experimentServiceManual() {
        System.out.println("Creado manualmente con @Bean");
        return new ExperimentService();
    }
}
