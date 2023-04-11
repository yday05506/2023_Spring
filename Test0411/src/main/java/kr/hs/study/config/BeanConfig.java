package kr.hs.study.config;

import kr.hs.study.beans.Car;
import kr.hs.study.beans.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfig {
    @Bean
    @Autowired
    public Car java1() {
        Car c = new Car();
        c.setDoor(4);
        c.setWheel(4);
        c.prData();
        return c;
    }

    @Bean
    @Autowired
    public Train java2() {
        Train t = new Train();
        t.setDoor(10);
        t.setWheel(10);
        t.setMan("김민주");
        t.fuel();
        t.prData();
        return t;
    }
}
