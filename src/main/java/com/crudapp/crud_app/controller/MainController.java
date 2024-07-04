package com.crudapp.crud_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    private String homeMapping() {
        return "Hello";
    }

//    private

}
