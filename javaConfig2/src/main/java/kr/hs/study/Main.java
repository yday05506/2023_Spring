package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        TestBean1 obj1 = ctx.getBean("java1", TestBean1.class);
        System.out.println(obj1);
        System.out.println("=====================================");

//        TestBean2 obj2 = ctx.getBean("java2", TestBean2.class);
        TestBean2 obj2 = ctx.getBean("ex", TestBean2.class);
        System.out.println(obj2);
        System.out.println(obj2.getData1());
        System.out.println(obj2.getData2());
        System.out.println(obj2.getData3());

        TestBean2 obj3 = ctx.getBean("java3", TestBean2.class);
        System.out.println(obj3.getData1());
        System.out.println(obj3.getData2());
        System.out.println(obj3.getData3());
        System.out.println("=====================================");

        TestBean3 obj4 = ctx.getBean("java4", TestBean3.class);
        obj4.initMethod();
        obj4.destroyMethod();

        ctx.close();
    }
}