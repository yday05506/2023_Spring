package kr.hs.study.beans;

public class Problem5 {
    private int a;

    public Problem5(int a) {
        this.a = a;
    }

    public void prData() {
        if(a / 10 == a % 10) System.out.println("10의 자리와 1의 자리가 같습니다.");
        else System.out.println("같지 않습니다.");
    }
}
