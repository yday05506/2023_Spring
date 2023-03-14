package kr.hs.study;

import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKr;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        HelloWorldKr h1 = ctx.getBean("h1", HelloWorldKr.class);
        HelloWorldEn h2 = ctx.getBean("h2", HelloWorldEn.class);

        h1.hello();
        h2.hello();

        ctx.close();
    }
}