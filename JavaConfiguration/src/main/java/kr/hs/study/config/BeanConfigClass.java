package kr.hs.study.config;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
// 객체 만들어달라고 스프링에게 요청하는 설정 파일
public class BeanConfigClass {
    @Bean
    public TestBean1 java1() {
        TestBean1 t = new TestBean1();
        return t;
    }

    @Scope("prototype")
    @Bean(name = "a")
    public TestBean2 java2() {
//        TestBean2 tt = new TestBean2();
//        return tt;
        return new TestBean2();
    }

    @Lazy
    @Bean
    public TestBean3 java3() {
        return new TestBean3();
    }
}
