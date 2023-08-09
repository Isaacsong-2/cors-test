package com.example.corstest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cors")
//@CrossOrigin(origins = "http://localhost:7070")
public class CorsController {

    @GetMapping
//    @CrossOrigin(origins = "http://localhost:7070")
    public String getResource(){
        return "Success";
    }
}
