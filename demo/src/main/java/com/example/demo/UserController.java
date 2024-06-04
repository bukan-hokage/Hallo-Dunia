package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/users")
//@Api(value = "User Management", description = "Operations for managing user accounts")
public class UserController {
    @GetMapping("/")
    public String root(){
        return "Running using version ";
    }
}
