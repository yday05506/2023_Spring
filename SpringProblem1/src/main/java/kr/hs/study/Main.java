package kr.hs.study;

import kr.hs.study.beans.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Problem1 p1 = ctx.getBean("p1", Problem1.class);
        p1.prData();
        System.out.println("===============================");

        Problem2 p2 = ctx.getBean("p2", Problem2.class);
        p2.prData();
        System.out.println("===============================");

        Problem3 p3 = ctx.getBean("p3", Problem3.class);
        p3.prData();
        System.out.println("===============================");

        Problem4 p4 = ctx.getBean("p4", Problem4.class);
        p4.prData();
        System.out.println("===============================");

        Problem5 p5 = ctx.getBean("p5", Problem5.class);
        p5.prData();
        System.out.println("===============================");

        Problem6 p6 = ctx.getBean("p6", Problem6.class);
        p6.prData();
        System.out.println("===============================");

        Problem7 p7 = ctx.getBean("p7", Problem7.class);
        p7.prData();
        System.out.println("===============================");

        Problem8 p8 = ctx.getBean("p8", Problem8.class);
        p8.prData();
        System.out.println("===============================");

        Problem9 p9 = ctx.getBean("p9", Problem9.class);
        p9.prData();
        System.out.println("===============================");

        ctx.close();
    }
}