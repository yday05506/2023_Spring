package kr.hs.study;

import kr.hs.study.beans.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Problem1 p1 = ctx.getBean("p1", Problem1.class);
        System.out.println(p1.getData2());
        System.out.println(p1.getData1());
        System.out.println("----------------------------------");

        Problem2 p2 = ctx.getBean("p2", Problem2.class);
        System.out.println("합 : " + (p2.getData1() + p2.getData2() + p2.getData3()));
        System.out.println("평균 : " + (double)(p2.getData1() + p2.getData2() + p2.getData3())/3);
        System.out.println("----------------------------------");

        Problem3 p3= ctx.getBean("p3", Problem3.class);
        if(p3.getData1() > p3.getData2()) System.out.println("1");
        else if(p3.getData1() < p3.getData2()) System.out.println("0");
        else if(p3.getData1() == p3.getData2()) System.out.println(p3.getData1() + " == " + p3.getData2());
        System.out.println("----------------------------------");

        Problem4 p4= ctx.getBean("p4", Problem4.class);
        if(p4.getData1() % 2 == 0) System.out.println(p4.getData1());
        if(p4.getData2() % 2 == 0) System.out.println(p4.getData2());
        if(p4.getData3() % 2 == 0) System.out.println(p4.getData3());
        System.out.println("----------------------------------");

        Problem5 p5= ctx.getBean("p5", Problem5.class);
        if(p5.getData1() / 10 == p5.getData1() % 10) System.out.println("10의 자리와 1의 자리가 같다.");
        else System.out.println("10의 자리와 1의 자리가 같지 않다.");
        System.out.println("----------------------------------");

        Problem6 p6= ctx.getBean("p6", Problem6.class);
        if(p6.getData1() + p6.getData2() > p6.getData3() || p6.getData1() + p6.getData3() > p6.getData2() || p6.getData2() + p6.getData3() > p6.getData1()) System.out.println("삼각형이다.");
        else System.out.println("삼각형이 아니다.");
        System.out.println("----------------------------------");

        Problem7 p7= ctx.getBean("p7", Problem7.class);
        int[] d = new int[11];
        for(int i = 0; i <= 10; i++) {
            if(p7.getData1() / 10 == i) d[i]++;
            if(p7.getData2() / 10 == i) d[i]++;
            if(p7.getData3() / 10 == i) d[i]++;
            System.out.println(i + "0점 대별 학생 수 : " + d[i]);
        }
        System.out.println("----------------------------------");

        Problem8 p8 = ctx.getBean("p8", Problem8.class);
        int max = 0;
        int min = 100;
        if(max < p8.getData1()) max = p8.getData1();
        if(p8.getData1() < p8.getData2()) max = p8.getData2();
        if(p8.getData2() < p8.getData3()) max = p8.getData3();

        if(min > p8.getData1()) min = p8.getData1();
        if(p8.getData1() > p8.getData2()) min = p8.getData2();
        if(p8.getData2() > p8.getData3()) min = p8.getData3();

        System.out.println("최대 점수 : " + max);
        System.out.println("최소 점수 : " + min);
        System.out.println("----------------------------------");

        Problem9 p9 = ctx.getBean("p9", Problem9.class);
        int sum = 0;
        int cnt = 0;
        if(p9.getData1() >= 20 && p9.getData1() <= 50) {
            sum += p9.getData1();
            cnt++;
        }
        if(p9.getData2() >= 20 && p9.getData2() <= 50) {
            sum += p9.getData2();
            cnt++;
        }
        if(p9.getData3() >= 20 && p9.getData3() <= 50) {
            sum += p9.getData3();
            cnt++;
        }
        if(p9.getData4() >= 20 && p9.getData4() <= 50) {
            sum += p9.getData4();
            cnt++;
        }
        if(p9.getData5() >= 20 && p9.getData5() <= 50) {
            sum += p9.getData5();
            cnt++;
        }

        System.out.println("합 : " + sum);
        System.out.println("평균 : " + (double)(sum/cnt));
    }
}