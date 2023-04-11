package kr.hs.study.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Car {
    private int wheel;
    private int door;

    public Car() {}

    public void prData() {
        System.out.println("바퀴 : " + wheel);
        System.out.println("문 : " + door);
    }
}
