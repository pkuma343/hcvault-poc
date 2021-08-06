package com.nagarro.poc.hcvault.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Environment environment;

    private String dbUser;

    @GetMapping(path = "/userinfo")
    public String getUserFromHCVault() {
        dbUser = environment.getProperty("db.user");
        System.out.println(dbUser);
        return dbUser;
    }
}
