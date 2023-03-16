package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        obj1.prData();  // 개발자가 주입
        System.out.println("===============================");

        TestBean1 obj2 = ctx.getBean("t2", TestBean1.class);
        obj2.prData();  // data1의 데이터를 Spring이 주입
        System.out.println("===============================");

        TestBean1 obj3 = ctx.getBean("t3", TestBean1.class);
        obj3.prData();  // data2의 데이터를 Spring이 주입
        System.out.println("===============================");

        TestBean1 obj4 = ctx.getBean("t4", TestBean1.class);
        obj4.prData();  // data3의 데이터를 Spring이 주입
        System.out.println("===============================");

//        TestBean2 obj5 = ctx.getBean("t5", TestBean2.class);
//        obj5.prData();

        TestBean2 obj6 = ctx.getBean("t6", TestBean2.class);
        obj6.prData();

        ctx.close();
    }
}