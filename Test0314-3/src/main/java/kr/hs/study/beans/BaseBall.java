package kr.hs.study.beans;

public class BaseBall implements Sports{
    @Override
    public void Sports() {
        System.out.println("경기 종목 : 야구 \n 선수 인원 : 5명");
    }

    @Override
    public void getPlayer() {
        System.out.println("선수 인원 : 5명");
    }

    @Override
    public void getName(String name) {
        System.out.println("경기 종목 : 야구");
    }

    @Override
    public void rule() {
        System.out.println("경기 규칙은 해당 클래스에서 작성한다.");
    }
}
