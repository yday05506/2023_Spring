package kr.hs.study.config;

import kr.hs.study.beans.Member;
import kr.hs.study.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("kr.hs.study.beans")
public class BeanConfig {
    @Bean
    public Person p1() {
        return new Person("kim", 30, "bob");
    }

    @Bean
    public Person p2() {
        return new Person("lee", 22, "john");
    }
}
