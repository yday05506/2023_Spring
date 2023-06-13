package kr.hs.study.model2.Controller;

import kr.hs.study.model2.dto.test1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class testController {
    // test1에 접속했을 때 test1.html을 실행
//    @GetMapping("/test1")
//    public String test1(@RequestParam ("id") String id, @RequestParam("pass") String pw, Model model) {
//        System.out.println("ID : " + id);
//        System.out.println("Password : " + pw);
//
//        model.addAttribute("uid", id);
//        model.addAttribute("upass", pw);
//
//        return "test1";
//    }

    @GetMapping("/test1")
    public String test1(@ModelAttribute test1 t1, Model model) {
        model.addAttribute("uid", t1.getId());
        model.addAttribute("upass", t1.getPass());

        return "test1";
    }

    @GetMapping("/test2")
    public ModelAndView test2(@RequestParam ("data1") String data1, @RequestParam("data2") String data2, ModelAndView mv) {
        mv.addObject("d1", data1);
        mv.addObject("d2", data2);
        mv.setViewName("test2");

        return mv;
    }

//    @GetMapping("/test3")
//    public String test3(Model model) {
//        List<String> list = new ArrayList<>();
//        list.add("kim");
//        list.add("lee");
//        list.add("park");
//
//        model.addAttribute("list", list);
//
//        return "test3";
//    }

    @GetMapping("/test3")
    public ModelAndView test3(ModelAndView mv) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("park");

        mv.addObject("list", list);
        mv.setViewName("test3");

        return mv;
    }
}
