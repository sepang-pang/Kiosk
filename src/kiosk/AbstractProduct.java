package kiosk;

import java.util.Scanner;

public abstract class AbstractProduct {

    private String ice = "얼음";
    private String sizeUP = "사이즈 업";
    private String addSyrup = "시럽 추가";


    public int icePrice = 1000;
    public int sizeUpPrice = 500;
    public int addSyrupPrice = 500;

    Scanner sc = new Scanner(System.in);

    public String getIce() {
        return ice;
    }

    public String getSizeUP() {
        return sizeUP;
    }

    public String getAddSyrup() {
        return addSyrup;
    }


    public abstract void choiceOption (int num);
}
