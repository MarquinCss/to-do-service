package com.example.todoservice.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String printHelloWorld(){
        return "um frontender que rodou um controller em spring, é isso mesmo????";
    }
}
