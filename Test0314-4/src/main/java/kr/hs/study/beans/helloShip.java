package kr.hs.study.beans;

public class helloShip implements Ship{

    @Override
    public void maxSpeed() {
        System.out.println("최고 속도");
    }

    @Override
    public void minSpeed() {
        System.out.println("최저 속도");
    }
}
