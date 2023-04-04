package kr.hs.study;

import kr.hs.study.beans.Problem1;
import kr.hs.study.beans.Problem2;
import kr.hs.study.beans.Problem3;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        Problem1 obj1 = ctx.getBean("java1", Problem1.class);
        obj1.prData();
        System.out.println("=====================================");

        Problem1 obj2 = ctx.getBean("java2", Problem1.class);
        obj2.getN();
        obj2.getM();
        obj2.prData();
        System.out.println("=====================================");

        Problem2 obj3 = ctx.getBean("java3", Problem2.class);
        obj3.prData();
        System.out.println();
        System.out.println("=====================================");

        Problem2 obj4 = ctx.getBean("java4", Problem2.class);
        obj4.getN();
        obj4.getS();
        obj4.prData();
        System.out.println();
        System.out.println("=====================================");

        Problem3 obj5 = ctx.getBean("java5", Problem3.class);
        obj5.prData();
        System.out.println("=====================================");

        Problem3 obj6 = ctx.getBean("java6", Problem3.class);
        obj6.getN();
        obj6.getHalf();
        obj6.getLine();
        obj6.prData();
        System.out.println("=====================================");

        ctx.close();
    }
}