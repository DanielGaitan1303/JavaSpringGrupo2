package com.example.demo;

import org.springframework.stereotype.Component;

@Component("experimentService")
public class ExperimentService {

    public ExperimentService() {
        System.out.println("Creado mediante @Component");
    }
}