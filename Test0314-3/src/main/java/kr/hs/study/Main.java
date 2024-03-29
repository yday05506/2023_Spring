package kr.hs.study;

import kr.hs.study.beans.BaseBall;
import kr.hs.study.beans.Sports;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Sports s1 = ctx.getBean("s1", Sports.class);

        s1.Sports();
        s1.getName();
        s1.getPlayer();
        s1.rule();

        ctx.close();
    }
}