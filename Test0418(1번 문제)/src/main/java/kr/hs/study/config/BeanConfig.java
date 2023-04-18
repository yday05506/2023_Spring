package kr.hs.study.config;

import kr.hs.study.beans.CatXml;
import kr.hs.study.beans.DogXml;
import kr.hs.study.beans.RabbitXml;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfig {
    @Bean
    public DogXml Dobj1() {
        DogXml d = new DogXml();
        return d;
    }

    @Bean
    public CatXml Cobj1() {
        CatXml c = new CatXml("고양이가 먹는다", "야옹야옹", "고양이가 움직인다");
        return c;
    }

    @Bean
    RabbitXml Robj1() {
        RabbitXml r = new RabbitXml("토끼가 먹는다", "래빗래빗", "토끼가 움직인다");
        return r;
    }

}
