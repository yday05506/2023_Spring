package kr.hs.study.beans;

public class TestBean {
    // 비즈니스 로직
    public void method1() {
        int a = 100/0;
        System.out.println("TestBean의 method1 호출");
    }
}
