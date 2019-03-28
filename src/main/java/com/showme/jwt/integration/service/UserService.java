package com.showme.jwt.integration.service;

import com.showme.jwt.integration.domain.RandomCity;
import com.showme.jwt.integration.domain.User;

import java.util.List;

public interface UserService {
    String cadastrar(User user);

    User findByEmail(String email);

    List<User> findAllUsers();

}
