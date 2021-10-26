package com.example.azure;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class WebController {
    @RequestMapping("/hello")
    public String showHelloWorld(){
        return "Hallo Welt!";
    }
}


