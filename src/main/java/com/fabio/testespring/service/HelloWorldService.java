package com.fabio.testespring.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String helloWorld(String name){
        return "Olá "+ name;
    }
}
