package com.sheoanna.mongo_data.services.controller;

import com.sheoanna.mongo_data.models.User;
import com.sheoanna.mongo_data.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/by-name/{name}")
    public User getByName(@PathVariable String name) {
        return userService.getByName(name);
    }
}
