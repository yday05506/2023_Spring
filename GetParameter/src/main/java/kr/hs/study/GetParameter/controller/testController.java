package kr.hs.study.GetParameter.controller;

import kr.hs.study.GetParameter.dto.test6;
import kr.hs.study.GetParameter.dto.test7;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testController {

    @GetMapping("/test1")
    public String test1(HttpServletRequest req) {
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        String c = req.getParameter("data3");

        System.out.println("data1 : " + a);
        System.out.println("data2 : " + b);
        System.out.println("data3 : " + c);
        return "result";
    }

    @GetMapping("/test2")
    public String test2(HttpServletRequest req) {
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        String[] c = req.getParameterValues("data3");

        System.out.println("data1 : " + a);
        System.out.println("data2 : " + b);
        for(String str : c) {
            System.out.println("data3 : " + str);
        }

        return "result";
    }

    @GetMapping("/test3")
    public String test3(WebRequest req) {
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        String[] c = req.getParameterValues("data3");

        System.out.println("data1 : " + a);
        System.out.println("data1 : " + b);
        for(String str : c) {
            System.out.println("data3 : " + str);
        }

        return "result";
    }

    @GetMapping("/test4/{a}/{b}/{c}")
    public String test4(@PathVariable String a, @PathVariable String b, @PathVariable String c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        return "result";
    }

    @GetMapping("/test5")
    // public String test5(@RequestParam String data1... )처럼 ("data1")을 굳이 안 써도 됨
    // 쓰는 이유는 잘 알아보게 하려고
    public String test5(@RequestParam("data1") String data1, String data2, String[] data3) {
        System.out.println(data1);
        System.out.println(data2);
        for (String i : data3) {
            System.out.println(i);
        }

        return "result";
    }

    @GetMapping("/test6")
    // @ModelAttribute test6 t
    // Boot가 test6 객체 t를 만들고 사용자의 데이터를 set 메서드를 이용해 멤버 변수에 넣는다
    public String test6(@ModelAttribute test6 t) {
        System.out.println(t.getData1());
        System.out.println(t.getData2());
        System.out.println(t.getData3());

        return "result";
    }

    @GetMapping("/test7")
    public String test7(@ModelAttribute test7 t) {

    }
}
