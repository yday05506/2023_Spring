package kr.hs.study.Model.Controller;

import kr.hs.study.Model.dto.test4;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testController {
    @GetMapping("/test1")
    public String test1(HttpServletRequest req, Model model) {
        String d1 = req.getParameter("data1");
        String d2 = req.getParameter("data2");

        // 사용자가 요청한 값을 model에 넣음 (담음)
        model.addAttribute("data1", d1);
        model.addAttribute("data2", d2);

//        System.out.println("Data1 : " + d1);
//        System.out.println("Data2 : " + d2);

        return "test1";
    }

    @RequestMapping("/test2/{data3}/{data4}")
    public String test2(@PathVariable String data3, @PathVariable String data4, Model model) {
        model.addAttribute("data3", data3);
        model.addAttribute("data4", data4);

        return "test2";
    }

    @GetMapping("/test3")
    public String test3(@RequestParam("data5") String d5, @RequestParam("data6") String d6, Model model) {
        model.addAttribute("data5", d5);
        model.addAttribute("data6", d6);

        return "test3";
    }

    @GetMapping("/test4")
    public String test4(@ModelAttribute test4 t, Model model) {
        model.addAttribute("data7", t.getData7());
        model.addAttribute("data8", t.getData8());
        model.addAttribute("data9", t.getData9());

        return "test4";
    }
}
