package kr.hs.study.beans;

// setter, getter만 있는 클래스 : POJO 클래스
public class TestBean2 {
    public TestBean2() {
    }

    private int data1;
    private String data2;
    private double data3;

    // 생성자를 내가 하나라도 만들었다면 기본 생성자 하나는 무조건 있어야 됨
    public TestBean2(int data1, String data2, double data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public int getData1() {
        return data1;
    }

    public String getData2() {
        return data2;
    }

    public double getData3() {
        return data3;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public void setData3(double data3) {
        this.data3 = data3;
    }
}
