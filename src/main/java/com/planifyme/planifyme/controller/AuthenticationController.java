package com.planifyme.planifyme.controller;

import com.planifyme.planifyme.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AuthenticationController {
    private UserServices userServices;
    @Autowired

    public AuthenticationController(UserServices userServices) {
        this.userServices = userServices;
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/register")
    public String register() {
        return "register";
    }


}
