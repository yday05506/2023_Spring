package kr.hs.study.beans;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component 안 됨(java, xml 파일로 객체 2개 만들어 줘야 함)
@Data
public class Person {
    String name;
    int age;
    String nickname;

    public Person(String name, int age, String nickname) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
    }

    public void go() {
        System.out.println("가다.");
    }
}
