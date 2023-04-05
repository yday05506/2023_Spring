package kr.hs.study.config;

import kr.hs.study.beans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfig {
//    @Bean
//    public TestBean2 java2() {
//        TestBean2 t = new TestBean2();
//        t.setData1(11);
//        t.setData2(11.11);
//        return t;
//    }
}
