package com.jsonobject.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jeongkuk on 2017-04-18.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "Hello, Spring Boot!";
    }
}
