package com.example.oauth2.controller;

import org.springframework.security.web.authentication.preauth.PreAuthenticatedCredentialsNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Controller {
    @GetMapping("/welcome")
    public String welcome(){
        return ("welcome to google");
    }

    @GetMapping("/login")
    public String login(){
       return ("welcome to login page");
    }

    @GetMapping("/")
    public String home(){
        return ("welcome to home");
    }
    @GetMapping("/user")
    public Principal user(Principal principal){
        System.out.println(principal);
        return principal;
    }


}
