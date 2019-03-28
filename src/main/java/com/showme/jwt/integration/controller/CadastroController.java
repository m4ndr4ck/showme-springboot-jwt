package com.showme.jwt.integration.controller;

import com.showme.jwt.integration.domain.User;
import com.showme.jwt.integration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class CadastroController {

    @Autowired
    private UserService userService;

    @PostMapping("/cadastrar")
    public String login(@RequestBody User user){
        String token = userService.cadastrar(user);
        return token;
    }

}
