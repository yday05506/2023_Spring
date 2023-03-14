package kr.hs.study;

import kr.hs.study.beans.Jpop;
import kr.hs.study.beans.Kpop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =  new ClassPathXmlApplicationContext("config.xml");
        Kpop m1 = ctx.getBean("kpop", Kpop.class);
        Jpop m2 = ctx.getBean("jpop", Jpop.class);

        m1.sound();
        m2.sound();

        ctx.close();
    }
}