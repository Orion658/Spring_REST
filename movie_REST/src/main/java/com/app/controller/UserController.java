package com.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.customException.DuplicateUserExeception;
import com.app.dto.UserDTO;
import com.app.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Long> addUser(@RequestBody UserDTO userDTO) throws DuplicateUserExeception {
        Long userId = userService.addUser(userDTO);
        return new ResponseEntity<>(userId, HttpStatus.CREATED);
    }
}
