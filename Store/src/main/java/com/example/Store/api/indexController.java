package com.example.Store.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class indexController {

    @GetMapping
    public String get() {
        return "Store System";
    }



}
