package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        TestBean1 t1 = ctx.getBean(TestBean1.class);

        t1.getData1();
        t1.getData2();

        ctx.close();
    }
}