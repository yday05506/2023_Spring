package kr.hs.study.GetParameter3.Controller;

import kr.hs.study.GetParameter3.dto.login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testController {
    @GetMapping("/login")
    public String login1(HttpServletRequest req) {
        return "login";
    }

//    @PostMapping("/login")
//    public String login(HttpServletRequest req) {
//        System.out.println("ID : " + req.getParameter("id"));
//        System.out.println("Password : " + req.getParameter("pw"));
//        System.out.println("Name : " + req.getParameter("name"));
//        System.out.println("Email : " + req.getParameter("email"));
//        System.out.println("Tel : " + req.getParameter("tel"));
//        System.out.println("Local : " + req.getParameter("local"));
//
//        return "index";
//    }

//    @PostMapping("/login")
//    public String login(WebRequest req) {
//        System.out.println("ID : " + req.getParameter("id"));
//        System.out.println("Password : " + req.getParameter("pw"));
//        System.out.println("Name : " + req.getParameter("name"));
//        System.out.println("Email : " + req.getParameter("email"));
//        System.out.println("Tel : " + req.getParameter("tel"));
//        System.out.println("Local : " + req.getParameter("local"));
//
//        return "index";
//    }

    @PostMapping("/login")
    public String login(@RequestParam("id") String id, @RequestParam("pw") String pw, @RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("tel") String tel, @RequestParam("local") String local) {
        System.out.println("ID : " + id);
        System.out.println("Password : " + pw);
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Tel : " + tel);
        System.out.println("Local : " + local);

        return "index";
    }

//    @PostMapping("/login")
//    public String login(@ModelAttribute login l) {
//        System.out.println("ID : " +  l.getId());
//        System.out.println("Password : " + l.getPw());
//        System.out.println("Name : " + l.getName());
//        System.out.println("Email : " + l.getEmail());
//        System.out.println("Tel : " + l.getTel());
//        System.out.println("Local : " + l.getLocal());
//
//        return "index";
//    }
}
