package kr.hs.study.Parameter_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testController {
    @GetMapping("/test1")
    public String test1(HttpServletRequest req) {
        String id = req.getParameter("id");
        String password = req.getParameter("pass");
        String name = req.getParameter("name");
        String content = req.getParameter("content");

        System.out.println("id : " + id + "\npassword : " + password + "\nname : " + name + "\ncontent : " + content);

        return "result";
    }

    @GetMapping("/test2")
    public String test2(WebRequest req) {
        String id = req.getParameter("id");
        String password = req.getParameter("pass");
        String name = req.getParameter("name");
        String content = req.getParameter("content");

        System.out.println("id : " + id + "\npassword : " + password + "\nname : " + name + "\ncontent : " + content);

        return "result";
    }
}
