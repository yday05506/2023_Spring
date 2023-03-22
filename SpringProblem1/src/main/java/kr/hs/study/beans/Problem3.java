package kr.hs.study.beans;

public class Problem3 {
    private int a;
    private int b;

    public Problem3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void prData() {
        if(a > b) System.out.println("1");
        else if(a < b) System.out.println("0");
        else if(a == b) System.out.println(a + " == " + b);
    }
}
