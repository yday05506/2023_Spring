package kr.hs.study.beans;

public class Problem7 {
    private int a;
    private int b;
    private int c;
    private int[] d = new int[10];

    public Problem7(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void prData() {
        for(int i = 0; i <= 100; i+=10) {
            if(a < i) d[i]++;
        }
    }
}
