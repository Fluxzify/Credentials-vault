package com.josevdev.credentials_vault.controller;


import com.josevdev.credentials_vault.model.User;
import com.josevdev.credentials_vault.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor

@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/createUser")
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@Valid @RequestBody User user){

        return userService.createUser(user);

    }
}
