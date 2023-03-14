package kr.hs.study;

import kr.hs.study.beans.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Hello h1 = ctx.getBean("h1", Hello.class);
        Hello h2 = ctx.getBean("h2", Hello.class);

        h1.hello();
        h2.hello();

        ctx.close();
    }
}