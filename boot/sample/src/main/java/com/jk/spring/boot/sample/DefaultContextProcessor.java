package com.jk.spring.boot.sample;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class DefaultContextProcessor {

    @RequestMapping("/")
    String defaultContext() {
        return "Welcome to Spring WORLD!!!- Test3";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DefaultContextProcessor.class, args);
    }
}
