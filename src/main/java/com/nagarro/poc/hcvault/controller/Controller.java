package com.nagarro.poc.hcvault.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${db.user}")
    private String dbuser;
    @GetMapping(path = "/userinfo")
    public String getUserFromHCVault() {
        System.out.println(dbuser);
        return dbuser;
    }
}
