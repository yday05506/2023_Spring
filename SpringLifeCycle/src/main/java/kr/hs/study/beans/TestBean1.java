package kr.hs.study.beans;

public class TestBean1 {
    TestBean1() {
        System.out.println("TestBean 기본 생성자");
    }
    void init_method() {
        System.out.println("init method");
    }

    void destroy_method() {
        System.out.println("destroy method");
    }
}
