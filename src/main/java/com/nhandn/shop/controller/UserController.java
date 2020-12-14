package com.nhandn.shop.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public ResponseEntity<?> testUser() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
