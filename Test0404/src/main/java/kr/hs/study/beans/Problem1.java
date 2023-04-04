package kr.hs.study.beans;

public class Problem1 {
    private int n;
    private int m;

    public Problem1(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public Problem1() {
    }

    public void prData() {
        int sum = 0;

        for(int i = n; i <= m; i++) {
            sum += i;
        }

        System.out.println("n부터 m까지의 합 : " + sum);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
}
