package com.fabio.testespring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// STATELESS -> a cada nova requisição recebe todas as infos que a funcionalidade precisa, STATEFULL -> o estado de cada cliente é mantido no servidor
@RequestMapping("/hello-world")
public class HelloWorldController {
    // post, get, delete, put, patch, options, head
    public String helloWorld(){
        return "olá";
    }
}
