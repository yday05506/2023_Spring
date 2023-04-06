package kr.hs.study.config;

import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// kr.hs.study.beans 하위에 있는 클래스들 중 "@"가 붙은 건 bean으로 만들어서 컨테이너에 보관
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfig {
    @Bean
    public DataBean2 java1() {
        return new DataBean2();
    }

    @Bean
    public DataBean2 java2() {
        return new DataBean2();
    }
}
