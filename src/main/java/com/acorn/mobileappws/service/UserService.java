package com.acorn.mobileappws.service;

import com.acorn.mobileappws.shared.dto.UserDto;
import org.apache.catalina.User;

public interface UserService {
    UserDto createUser(UserDto user);
}
