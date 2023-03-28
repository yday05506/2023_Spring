package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        obj1.prData();
        System.out.println(obj1);

        ctx.close();
        System.out.println("=================================================");

        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext();

        ctx2.close();
    }
}