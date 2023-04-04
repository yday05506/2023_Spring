package kr.hs.study.config;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

// 이 파일은 객체 만들어달라고 요청하는 설정 파일
@Configuration
public class BeanConfig {
    // TestBean1의 객체 만들어줘!! - 요청
    @Bean
    public TestBean1 java1() {
        TestBean1 t = new TestBean1();
        return t;
    }

    @Bean(name = "ex")
    public TestBean2 java2() {
        TestBean2 t = new TestBean2(31, "김민주", 2.28);
        return t;
    }

    @Bean
    @Lazy
    @Scope("prototype")
    public TestBean2 java3() {
        TestBean2 t2 = new TestBean2();
        t2.setData1(19);
        t2.setData2("양다연");
        t2.setData3(5.6);
        return t2;
    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public TestBean3 java4() {
        return new TestBean3();
    }
}
