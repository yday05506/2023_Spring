package kr.hs.study.config;

import kr.hs.study.beans.Problem1;
import kr.hs.study.beans.Problem2;
import kr.hs.study.beans.Problem3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class BeanConfig {
    @Bean
    public Problem1 java1() {
        Problem1 p = new Problem1(19, 31);
        return p;
    }

    @Bean
    public Problem1 java2() {
        Problem1 p2 = new Problem1();
        p2.setN(2);
        p2.setM(28);
        return p2;
    }

    @Bean
    public Problem2 java3() {
        Problem2 p = new Problem2(31, 'e');
        return p;
    }

    @Bean
    public Problem2 java4() {
        Problem2 p2 = new Problem2();
        p2.setN(19);
        p2.setS('o');
        return p2;
    }

    @Bean
    public Problem3 java5() {
        Problem3 p = new Problem3(0, 31, 19);
        return p;
    }

    @Bean
    public Problem3 java6() {
        Problem3 p2 = new Problem3();
        p2.setN(2);
        p2.setHalf(19);
        p2.setLine(31);
        return p2;
    }
}
