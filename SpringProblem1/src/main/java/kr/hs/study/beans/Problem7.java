package kr.hs.study.beans;

public class Problem7 {
    private int a;
    private int b;
    private int c;
    private int[] d = new int[11];

    public Problem7(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void prData() {
        for(int i = 0; i < 11; i++) {
            if (a / 10 == i) d[i]++;
            if (b / 10 == i) d[i]++;
            if (c / 10 == i) d[i]++;
            System.out.println(i + "0점 대 학생 수 : " + d[i]);
        }
    }
}
