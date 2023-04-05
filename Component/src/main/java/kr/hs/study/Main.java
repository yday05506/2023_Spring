package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        TestBean1 obj1 = ctx.getBean(TestBean1.class);
        System.out.println(obj1);
        System.out.println("==============================================");

//        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfig.class);
//        TestBean2 obj2 = ctx2.getBean("java2", TestBean2.class);
//        System.out.println(obj2.getData1());
//        System.out.println(obj2.getData2());
        TestBean2 obj2 = ctx.getBean(TestBean2.class);
//        obj2.setData1(11);
//        obj2.setData2(11.11);
        System.out.println("obj2.getData1 : " + obj2.getData1());
        System.out.println("obj2.getData2 : " + obj2.getData2());

        ctx.close();
    }
}