package kr.hs.study.beans;

public class Problem9 {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int sum;

    public Problem9(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public void prData() {
        if(a >= 20 && a <= 50) sum += a;
        if(b >= 20 && b <= 50) sum += b;
        if(c >= 20 && c <= 50) sum += c;
        if(d >= 20 && d <= 50) sum += d;
        if(e >= 20 && e <= 50) sum += e;
        System.out.println("합 : " + sum);
        System.out.println("평균 : " + (double)sum / 5);
    }
}
