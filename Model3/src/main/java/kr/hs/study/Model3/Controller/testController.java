package kr.hs.study.Model3.Controller;

import kr.hs.study.Model3.dto.test1;
import kr.hs.study.Model3.dto.test2;
import kr.hs.study.Model3.dto.test3;
import kr.hs.study.Model3.dto.test4;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class testController {
    @GetMapping("/test4")
    public String test(HttpServletRequest req) {
        return "test4";
    }

    @PostMapping("/test1")
    public String test1(Model model, @ModelAttribute test1 t) {
        model.addAttribute("n", t.getN());
        model.addAttribute("m", t.getM());

        int sum = 0;

        for(int i = t.getN(); i <= t.getM(); i++) {
            sum += i;
        }

        t.setSum(sum);
        model.addAttribute("sum", t.getSum());

        return "test1";
    }

    @PostMapping("/test2")
    public String test2(Model model, @ModelAttribute test2 t) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 100; i++) {
            if(i % t.getN() == 0) {
                list.add(i);
            }
        }

        model.addAttribute("list", list);

        return "test2";
    }

    @PostMapping("/test3")
    public String test3(Model model, @ModelAttribute test3 t) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i = 100; i <= 999; i++) {
            if(i % t.getN() == 0) {
                list.add(i);
                sum += i;
            }
        }
        t.setSum(sum);

        model.addAttribute("list", list);
        model.addAttribute("sum", sum);

        return "test3";
    }

    @PostMapping("/test4")
    public String test4(Model model, @ModelAttribute test4 t) {
        model.addAttribute("n", t.getN());

    }
}
