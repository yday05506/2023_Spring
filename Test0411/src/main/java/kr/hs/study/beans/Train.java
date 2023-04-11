package kr.hs.study.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Train {
    private int wheel;
    private int door;
    private String man;

    public Train() {}

    public void fuel() {
        System.out.println("연료를 넣다");
    }

    public void prData() {
        System.out.println("바퀴 : " + wheel);
        System.out.println("문 : " + door);
        System.out.println("운전수 : " + man);
        fuel();
    }
}
