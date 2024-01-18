package com.app.service;

import com.app.customException.DuplicateUserExeception;
import com.app.dto.UserDTO;

public interface UserService {
    Long addUser(UserDTO userDTO) throws DuplicateUserExeception;
}