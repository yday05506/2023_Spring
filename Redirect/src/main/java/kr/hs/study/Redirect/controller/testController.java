package kr.hs.study.Redirect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
    // redirect로 요청했을 때 result로 주소를 변경
    @GetMapping("/redirect")
    public String redirect() {
        return "redirect:result";
    }

    // forward로 요청
    @GetMapping("/forward")
    public String forward() {
        return "forward:result";
    }

    // redirect
    @GetMapping("/result")
    public String result() {
        return "result";
    }
}
