package com.app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserRepository;
import com.app.dto.UserDTO;
import com.app.entity.User;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Long addUser(UserDTO userDTO) {
        // Implement logic to add a user
        User user = new User();
        // set userDTO properties to user
        userRepository.save(user);
        return user.getId();
    }
}
