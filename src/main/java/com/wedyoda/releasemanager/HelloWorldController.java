package com.wedyoda.releasemanager;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class HelloWorldController {

    @RequestMapping("/helloworld")
    public String index() {
        return "Greetings from Spring Boot!";
    }



}
