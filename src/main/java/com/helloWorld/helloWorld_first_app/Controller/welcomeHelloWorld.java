package com.helloWorld.helloWorld_first_app.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeHelloWorld {

    @GetMapping("/start")
    public String welcome(){
        return "Hello World";
    }
}
