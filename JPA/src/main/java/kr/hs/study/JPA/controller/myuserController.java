package kr.hs.study.JPA.controller;

import kr.hs.study.JPA.dto.myuserDTO;
import kr.hs.study.JPA.service.myuserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class myuserController {
    @Autowired
    private myuserServiceImpl service;

    @GetMapping("/add_form")
    public String form() {
        return "add_form";
    }

    @PostMapping("/add_form")
    public String add(myuserDTO dto) {
        service.insert(dto);
        return "add_form";
    }
}
