package com.fabio.testespring.controller;

import com.fabio.testespring.domain.User;
import com.fabio.testespring.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
// STATELESS -> a cada nova requisição recebe todas as infos que a funcionalidade precisa, STATEFULL -> o estado de cada cliente é mantido no servidor
@RequestMapping("/hello-world")
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;
//    public HelloWorldController(HelloWorldService helloWorldService) {
//        this.helloWorldService = helloWorldService;
//    }

    @GetMapping
    // post, get, delete, put, patch, options, head
    // GET /hello-world
    public String helloWorld(){
        return helloWorldService.helloWorld("fabio");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "none") String filter,  @RequestBody User body){
        return "Isso é um Post: " + body.getName() + id ;
    }
}
