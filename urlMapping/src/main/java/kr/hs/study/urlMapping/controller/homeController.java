package kr.hs.study.urlMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/test1")
    public String test1() {
        return "test1";
    }

    @GetMapping("/test2")
    public String test2() {
        return "sub2/test2";
    }

    @GetMapping("/test3")
    public String test3() {
        return "sub2/sub3/test3";
    }
}

