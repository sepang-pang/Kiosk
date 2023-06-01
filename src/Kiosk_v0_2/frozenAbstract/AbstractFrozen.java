package Kiosk_v0_2.frozenAbstract;

import Kiosk_v0_2.Product;

import java.util.Scanner;

public abstract class AbstractFrozen {
    Product product = new Product();

    // ======================== 필드 ========================
    // 쉐이크
    double shakePrice = product.getPriceShake(); // 쉐이크 가격

    // 컨 앤 콘
    double cupsConesPrice = product.getPriceCupsCones(); // 컵 앤 콘 가격
    double largeCupsCones = product.getLargeCupsCones(); // 컵 앤 콘 라지사이즈 가격 // 이거는 추가 옵션

    // 콘크리트
    double concreatesPrice = product.getPriceConcretes(); // 콘크리트 가격
    double largeConcretes = product.getLargeConcretes(); // 콘크리트 라지사이즈 가격

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

