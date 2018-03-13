package com.example.simplesecuritythymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author Philip Mark Gutierrez
 * @version 1.0
 * @since March 12, 2018
 */
@Controller
public class SimpleController {
    @GetMapping("/")
    public String home(Map<String, Object> model) {
        model.put("name", "Guest");
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin/index";
    }

    @GetMapping("/user")
    public String user() {
        return "user/user";
    }

    @GetMapping("/403")
    public String accessDenied() {
        return "403";
    }
}
