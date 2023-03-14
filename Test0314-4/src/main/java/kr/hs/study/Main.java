package kr.hs.study;

import kr.hs.study.beans.Ship;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Ship s1 = ctx.getBean("s1", Ship.class);

        s1.maxSpeed();
        s1.minSpeed();

        ctx.close();
    }
}