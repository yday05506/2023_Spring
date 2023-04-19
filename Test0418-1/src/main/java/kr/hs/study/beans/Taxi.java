package kr.hs.study.beans;

import kr.hs.study.Meter;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Taxi implements Meter {
    private int distance;

    public Taxi(int distance) {
        this.distance = distance;
    }

    @Override
    public void start() {
        System.out.println("운행을 시작합니다");
    }

    @Override
    public int stop(int distance) {
        int fare = distance * 2;
        System.out.println("운행을 종료합니다. 요금은 " + fare + "원입니다.");
        return fare;
    }
}
