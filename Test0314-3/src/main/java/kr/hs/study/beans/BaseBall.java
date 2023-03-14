package kr.hs.study.beans;

public class BaseBall implements Sports{
    String name;
    int player;
    @Override
    public void Sports(String name, int player) {
        this.player = player;
        this.name = name;
        System.out.println("경기 종목 : " + name + "\n선수 인원 : " + player);
    }

    @Override
    public void getPlayer(int player) {
        this.player = player;
        System.out.println("선수 인원 : " + player);
    }

    @Override
    public void getName(String name) {
        this.name = name;
        System.out.println("경기 종목 : " + name);
    }

    @Override
    public void rule() {
        System.out.println("경기 규칙은 해당 클래스에서 작성한다.");
    }
}
