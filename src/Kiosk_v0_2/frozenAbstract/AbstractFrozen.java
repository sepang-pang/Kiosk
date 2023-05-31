package Kiosk_v0_2.frozenAbstract;

import java.util.Scanner;

public abstract class AbstractFrozen {
    // ======================== 필드 ========================
    // 쉐이크
    private double shakePrice = 5.9; // 쉐이크 가격

    // 컨 앤 콘
    private double cupsConesPrice = 4.9; // 컵 앤 콘 가격
    private double largeCupsCones = 1.0; // 컵 앤 콘 라지사이즈 가격

    // 콘크리트
    private double concreatesPrice = 5.9; // 콘크리트 가격
    private double largeConcretes = 3.0; // 콘크리트 라지사이즈 가격

    // ======================== GET ========================
    // get 컵 앤 콘
    public double getLargeCupsCones() {
        return largeCupsCones;
    }

    // get 콘크리트
    public double getLargeConcretes() {
        return largeConcretes;
    }

    // ======================== 생성자 ========================
    public AbstractFrozen() {
        System.out.println("=========================");
        System.out.println("|" + "   아이스크림 선택   " + "|");
        System.out.println("=========================");
    }

    Scanner sc = new Scanner(System.in);


    // ======================= 추상메서드 =======================
    public abstract void choiceOption();

}

