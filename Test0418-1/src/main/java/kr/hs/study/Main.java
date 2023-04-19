package kr.hs.study;

import kr.hs.study.beans.Bus;
import kr.hs.study.beans.Taxi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // xml
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Taxi t1 = ctx.getBean("t1", Taxi.class);
        t1.start();
        t1.setDistance(20);
        t1.stop(t1.getDistance());

        Bus b1 = ctx.getBean("b1", Bus.class);
        b1.start();
        b1.setDistance(40);
        b1.stop(b1.getDistance());
    }
}