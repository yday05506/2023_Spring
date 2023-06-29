package kr.hs.study.JDBC.controller;

import kr.hs.study.JDBC.dto.myUserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {
    @GetMapping("/write_form")
    public String write_form() {
        return "write_form";
    }

    @PostMapping("/write_form")
    public String write_form(@ModelAttribute myUserDTO user) {
        System.out.println("id : " + user.getId());
        System.out.println("password : " + user.getPw());

        return "write_form";
    }
}
