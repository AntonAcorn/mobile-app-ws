package com.acorn.mobileappws.service;

import com.acorn.mobileappws.shared.dto.UserDto;
import org.apache.catalina.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
}
