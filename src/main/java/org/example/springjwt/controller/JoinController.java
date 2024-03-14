package org.example.springjwt.controller;

import org.example.springjwt.dto.JoinDTO;
import org.example.springjwt.service.JoinService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class JoinController {

    private final JoinService joinService;

    public JoinController(JoinService joinService) {
        this.joinService = joinService;
    }

    @PostMapping("/join")
    public String join(JoinDTO dto) {

        joinService.joinProcess(dto);
        return "ok";
    }
}
