package kr.hs.study.product.controller;

import kr.hs.study.product.dao.productDAO;
import kr.hs.study.product.dto.productDTO;
import kr.hs.study.product.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {
    @Autowired
    private productService service;

    @GetMapping("/regist")
    public String regist() {
        return "regist";
    }

    @PostMapping("/regist")
    public String regist1(@ModelAttribute productDTO r) {
        service.add(r);

        return "index";
    }
}
