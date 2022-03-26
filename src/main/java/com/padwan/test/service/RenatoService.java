package com.padwan.test.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RenatoService {

    public List<String> skills(){
        List<String> skills = new ArrayList<>();
        skills.add("Desenvolvedor Java");
        skills.add("Esforçado");
        skills.add("Esperto");
        skills.add("Com vontade em Aprender");
        skills.add("Front End");
        skills.add("Back End");
        skills.add("Spring Boot/API REST");
        return skills;
    }

}
