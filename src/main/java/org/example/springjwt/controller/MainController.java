package org.example.springjwt.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MainController {
    @GetMapping("/")
    public String main() {
        return "main";
    };

    @PostMapping("/login")
    public String login(HttpServletResponse response) {
        System.out.println(response.getHeader("Authentication"));

        return "";
    }
}
