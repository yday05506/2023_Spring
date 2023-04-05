package kr.hs.study.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// type으로 가져오기
@Component
//@Component("test")
@Lazy
@Scope("prototype")
public class TestBean1 {
    public TestBean1() {
        System.out.println("TestBean1의 생성자");
    }
}
