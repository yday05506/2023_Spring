package kr.hs.study.GetParameter3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }
}
