package kr.hs.study.beans;

import lombok.Data;

@Data
public class TestBean2 {
    // byType으로 자동 주입 시켜 data3, data4 출력
    private DataBean3 data3;
    private DataBean3 data4;
}
