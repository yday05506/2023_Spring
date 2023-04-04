package kr.hs.study.beans;

public class Problem2 {
    private int n;
    private char s;

    public Problem2() {
    }

    public Problem2(int n, char s) {
        this.n = n;
        this.s = s;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public char getS() {
        return s;
    }

    public void setS(char s) {
        this.s = s;
    }

    public void prData(){
        for(int i = 1; i <= n; i++) {
            if(s == 'o') {
                if(i % 2 == 1) System.out.print(i + "\t");
            }
            if(s == 'e') {
                if(i % 2 == 0) System.out.print(i + "\t");
            }
        }
    }
 }
