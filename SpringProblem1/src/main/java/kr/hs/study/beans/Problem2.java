package kr.hs.study.beans;

public class Problem2 {
    private int a;
    private int b;
    private int c;

    public Problem2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void prData() {
        System.out.println("합 : " + (a+b+c));
        System.out.println("평균 : " + (double)(a+b+c) / 3);
    }
}
