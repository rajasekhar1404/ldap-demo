package com.ldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LdapController {

    @GetMapping("/welcome")
    public String getMessage() {
        return "welcome to ldap configurations.";
    }

}
