package com.example.tpinfo3055.demo.Users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/users")
public class UserController {

    @GetMapping
    public String getUsers() {
        return "Users";
    }

}
