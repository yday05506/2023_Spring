package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        System.out.println(obj1);
        System.out.println("=================================================");

        TestBean1 obj2 = ctx2.getBean("java1", TestBean1.class);
        System.out.println(obj2);
        System.out.println("=================================================");

        TestBean2 obj3 = ctx.getBean("t2", TestBean2.class);
        obj3.prMethod();
        System.out.println("=================================================");

//        TestBean2 obj4 = ctx2.getBean("java2", TestBean2.class);
        TestBean2 obj4 = ctx2.getBean("a", TestBean2.class);
        obj4.prMethod();
        System.out.println(obj4);
        TestBean2 obj7 = ctx2.getBean("a", TestBean2.class);    // @Scope("prototype")
        System.out.println(obj7);
        System.out.println("=================================================");

        TestBean3 obj5 = ctx.getBean("t3", TestBean3.class);
        obj5.prMethod2();
        System.out.println("=================================================");

        TestBean3 obj6 = ctx2.getBean("java3", TestBean3.class);
        obj6.prMethod2();
        System.out.println("=================================================");

        TestBean4 obj8 = ctx.getBean("t4", TestBean4.class);
        obj8.init();
        obj8.destroy();

        ctx.close();
        ctx2.close();
    }
}