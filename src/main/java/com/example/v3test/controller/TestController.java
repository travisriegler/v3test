package com.example.v3test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok("testing restricting policies on AWS");
    }
}

