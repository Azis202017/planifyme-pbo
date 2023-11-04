package com.planifyme.planifyme.controller;

import com.planifyme.planifyme.dto.UserDto;
import com.planifyme.planifyme.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    private final UserServices userServices;

    @Autowired
    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<UserDto> users = userServices.findAllClubs();
        model.addAttribute("users", users);
        return "users-list";
    }
}
