package kr.hs.study;

import kr.hs.study.beans.CatXml;
import kr.hs.study.beans.DogXml;
import kr.hs.study.beans.RabbitXml;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // xml
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        DogXml Dobj = ctx.getBean("d1", DogXml.class);
        Dobj.eat();
        Dobj.bark();
        Dobj.move();

        CatXml Cobj = ctx.getBean("c1", CatXml.class);
        Cobj.eat();
        Cobj.bark();
        Cobj.move();

        RabbitXml Robj = ctx.getBean("r1", RabbitXml.class);
        Robj.eat();
        Robj.bark();
        Robj.move();

        System.out.println("============================");

        // java
        AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(BeanConfig.class);
        DogXml Dobj2 = atx.getBean("Dobj1", DogXml.class);
        Dobj2.setEatData("강아지가 먹는다");
        Dobj2.setBarkData("멍멍");
        Dobj2.setMoveData("강아지가 뛰다");
        System.out.println(Dobj2.getEatData());
        System.out.println(Dobj2.getBarkData());
        System.out.println(Dobj2.getEatData());

        CatXml Cobj2 = atx.getBean("Cobj1", CatXml.class);
        Cobj2.setEatData("고양이가 먹는다");
        Cobj2.setBarkData("야옹");
        Cobj2.setMoveData("고양이가 뛰다");
        System.out.println(Cobj2.getEatData());
        System.out.println(Cobj2.getBarkData());
        System.out.println(Cobj2.getMoveData());

        RabbitXml Robj2 = atx.getBean("Robj1", RabbitXml.class);
        Robj2.setEatData("토끼가 먹는다");
        Robj2.setBarkData("래빗래빗");
        Robj2.setMoveData("토끼가 뛰다");
        System.out.println(Robj2.getEatData());
        System.out.println(Robj2.getBarkData());
        System.out.println(Robj2.getMoveData());

        System.out.println("============================");
    }
}