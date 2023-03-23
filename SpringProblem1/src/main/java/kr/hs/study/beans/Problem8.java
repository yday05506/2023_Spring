package kr.hs.study.beans;

public class Problem8 {
    private int a;
    private int b;
    private int c;
    private int max = 0;
    private int min = 100;

    public Problem8(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void prData() {
        if(max < a) max = a;
        if(a < b) max = b;
        if(b < c) max = c;

        if(min > a) min = a;
        if(a > b) min = b;
        if(b > c) min = c;

        System.out.println("최대 점수 : " + max);
        System.out.println("최소 점수 : " + min);
    }
}
