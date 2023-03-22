package kr.hs.study.beans;

public class Problem6 {
    private int a;
    private int b;
    private int c;

    public Problem6(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void prData() {
        if(a+b > c || a+c > b || b+c > a) System.out.println("삼각형이 가능합니다.");
        else System.out.println("삼각형이 불가능합니다.");
    }
}
