package com.apiapp.springbootproject.controller;

import com.apiapp.springbootproject.model.DemoUser;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @GetMapping
    public ResponseEntity demoInitiator () {
        return ResponseEntity.ok("Response From Demo Initiator");
    }

    @PostMapping
    public ResponseEntity demoInitiator (@RequestBody DemoUser demoUser) {
        return ResponseEntity.ok("Got username as : "+demoUser.getUsername());
    }

}
