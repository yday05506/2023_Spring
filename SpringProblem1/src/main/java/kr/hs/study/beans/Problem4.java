package kr.hs.study.beans;

public class Problem4 {
    private int a;
    private int b;
    private int c;

    public Problem4(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void prData() {
        if(a % 2 == 0) System.out.println(a);
        if(b % 2 == 0) System.out.println(b);
        if(c % 2 == 0) System.out.println(c);
    }
}
