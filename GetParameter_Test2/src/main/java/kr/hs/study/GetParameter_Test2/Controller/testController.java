package kr.hs.study.GetParameter_Test2.Controller;

import kr.hs.study.GetParameter_Test2.dto.login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testController {

    @GetMapping("/login")
    public String login1(HttpServletRequest req) {
        return "login";
    }

//    @PostMapping("/login")
//    public String login(HttpServletRequest req) {
//        String id = req.getParameter("id");
//        String password = req.getParameter("password");
//
//        System.out.println("id : " + id);
//        System.out.println("password : " + password);
//        return "login";
//    }

//    @PostMapping("/login")
//    public String login(WebRequest req) {
//        String id = req.getParameter("id");
//        String pw = req.getParameter("password");
//
//        System.out.println("id : " + id);
//        System.out.println("password : " + pw);
//
//        return "index";
//    }

//    @PostMapping("/login")
//    public String login(@RequestParam ("id")String id, @RequestParam("password") String pw) {
//        System.out.println(id);
//        System.out.println(pw);
//
//        return "index";
//    }

    @PostMapping("/login")
    public String login(@ModelAttribute login t) {
        System.out.println("id : " + t.getId());
        System.out.println("password : " + t.getPassword());

        return "index";
    }
}
