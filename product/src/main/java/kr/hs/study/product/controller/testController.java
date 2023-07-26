package kr.hs.study.product.controller;

import kr.hs.study.product.dto.regist;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {
    @GetMapping("/regist")
    public String regist() {
        return "regist";
    }

    @PostMapping("/regist")
    public String regist1(@ModelAttribute regist r) {
        System.out.println("상품아이디 : " + r.getProduct_id());
        System.out.println("상품명 : " + r.getProduct_name());

        return "index";
    }
}
