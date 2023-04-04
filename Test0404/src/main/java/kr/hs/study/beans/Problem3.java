package kr.hs.study.beans;

public class Problem3 {
    private int n;
    private int half;
    private int line;
    public Problem3() {
    }

    public Problem3(int n, int half, int line) {
        this.n = n;
        this.half = half;
        this.line = line;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getHalf() {
        return half;
    }

    public void setHalf(int half) {
        this.half = half;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void prData() {
        double pi = 3.14;
        double circle = 0;
        double cLength = 0;
        int square = 0;
        while(true) {
            if(n == 0) break;
            else if(n == 1) {
                circle = 2 * pi * half;
                cLength = half * half * pi;
                System.out.println("원의 둘레 : " + circle + ", 원의 넓이 : " + cLength);
                break;
            }
            else if(n == 2) {
                square = line * 2;
                System.out.println("사각형의 넓이 : " + square);
                break;
            }
        }
    }
 }
