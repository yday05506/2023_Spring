package kr.hs.study.beans;

import kr.hs.study.Animal;
import org.springframework.stereotype.Component;

@Component
public class DogXml implements Animal {
    private String barkData;
    private String eatData;
    private String moveData;

    // constructor
    public DogXml() {
        this.barkData = "짖다";
        this.eatData = "먹다";
        this.moveData = "걷다";
    }

    public DogXml(String barkData, String eatData, String moveData) {
        this.moveData = moveData;
        this.eatData = eatData;
        this.barkData = barkData;
    }

    @Override
    public void move() {
        System.out.println(moveData);
    }

    @Override
    public void eat() {
        System.out.println(eatData);
    }

    @Override
    public void bark() {
        System.out.println(barkData);
    }

    // getter, setter
    public String getBarkData() {
        return barkData;
    }

    public void setBarkData(String barkData) {
        this.barkData = barkData;
    }

    public String getEatData() {
        return eatData;
    }

    public void setEatData(String eatData) {
        this.eatData = eatData;
    }

    public String getMoveData() {
        return moveData;
    }

    public void setMoveData(String moveData) {
        this.moveData = moveData;
    }
}
