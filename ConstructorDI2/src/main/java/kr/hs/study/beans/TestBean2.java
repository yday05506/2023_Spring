package kr.hs.study.beans;

public class TestBean2 {
    private DataBean data1;
    private DataBean data2;

    public TestBean2(DataBean data1, DataBean data2) {
        // data1, data2 : DataBean 객체의 주소값이 들어감
        this.data1 = data1;
        this.data2 = data2;
    }

    public void prData() {
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
    }
}
