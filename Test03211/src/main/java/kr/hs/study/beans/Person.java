package kr.hs.study.beans;

public class Person {
    String name;
    int age;
    Job job;

    public Person(String name, int age, Job job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void prData() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("직업 : " + job);
    }
}
