package com.example.oauth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/users")
public class UserController {
    private static Logger log = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value="/user_info", method = RequestMethod.GET)
    public Principal user(Principal user){

        return user;
    }

    @RequestMapping(value="/auth_test", method = RequestMethod.GET)
    public String auth_test(){

        return "授权测试成功";
    }

}
