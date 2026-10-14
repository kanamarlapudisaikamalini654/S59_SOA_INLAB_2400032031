package com.klu.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/admin")
    public String admin() {
        return "Admin can manage users";
    }

    @GetMapping("/user")
    public String user() {
        return "User can view details";
    }
}