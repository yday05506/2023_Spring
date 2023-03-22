package kr.hs.study.beans;

public class Problem1 {
    private String number1;
    private String number2;

    public Problem1(String number1, String number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void prData() {
        System.out.println("data2 : " + number2);
        System.out.println("data1 : " + number1);
    }
}
