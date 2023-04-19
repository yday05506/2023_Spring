package kr.hs.study.config;

import kr.hs.study.beans.Bus;
import kr.hs.study.beans.Taxi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfig {

    @Bean
    public Bus b1(){
        Bus b = new Bus(20);
        return b;
    }

    @Bean
    public Taxi t1() {
        Taxi t = new Taxi(40);
        return t;
    }
}
