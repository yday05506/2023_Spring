package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        System.out.println("Data1 : " + obj1.getData1());

        TestBean1 obj2 = ctx.getBean("t2", TestBean1.class);
        System.out.println("Data2 : " + obj2.getData2());

        TestBean1 obj3 = ctx.getBean("t3", TestBean1.class);
        System.out.println("Data3 : " + obj3.isData3());

        TestBean1 obj4 = ctx.getBean("t4", TestBean1.class);
        System.out.println("Data4 : " + obj4.getData4());

        TestBean2 obj5 = ctx.getBean("t5", TestBean2.class);
        System.out.println("Data1 : " + obj5.getData1());

        TestBean2 obj6 = ctx.getBean("t6", TestBean2.class);
        System.out.println("Data2 : " + obj6.getData2());

        ctx.close();
    }
}