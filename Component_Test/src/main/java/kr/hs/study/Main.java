package kr.hs.study;

import kr.hs.study.beans.Member;
import kr.hs.study.beans.Person;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        Member p = ctx.getBean(Member.class);

        System.out.println("p1 이름 : " + p.getP1().getName());
        System.out.println("p1 나이 : " + p.getP1().getAge());
        System.out.println("p1 별명 : " + p.getP1().getNickname());
        System.out.println("p2 이름: " + p.getP2().getName());
        System.out.println("p2 나이 : " + p.getP2().getAge());
        System.out.println("p2 별명 : " + p.getP2().getNickname());

        System.out.println("=================================");

        ctx.close();
    }
}