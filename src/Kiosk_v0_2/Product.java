package Kiosk_v0_2;

import java.util.ArrayList;
import java.util.Objects;

public class Product extends Menu {
    // ============ 햄버거 가격 ============ //
    private String priceShackeBurger = "W 6.9";
    private double priceShackeBurgerDouble = 6.9;
    private double priceSmokeShack = 8.9;
    private double priceshroomBurger = 9.4;

    // ============ 아이스크림 가격 ============ //
    private double priceShake = 5.9;
    private double priceCupsCones = 4.9;
    private double priceConcretes = 5.9;

    // ============ 음료수 가격 ============ //
    private double priceLemonade = 3.9;
    private double priceIcedTea = 3.4;
    private double priceFifty = 3.5;

    // ============ 초기 메뉴 리스트로 저장 ============ //
    public ArrayList<ArrayList<String>> displayMenu() {

        ArrayList<ArrayList<String>> menuScreen = new ArrayList<>();

        ArrayList<String> bugers = new ArrayList<>();
        bugers.add(getBurgers());
        bugers.add(getBurgersInfo());
        menuScreen.add(bugers);

        ArrayList<String> frozen = new ArrayList<>();
        frozen.add(getFrozen());
        frozen.add(getFrozeInfo());
        menuScreen.add(frozen);

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add(getDrinks());
        drinks.add(getDrinksInfo());
        menuScreen.add(drinks);

        return menuScreen;
    }

    // ============ 오더 메뉴 리스트로 저장 ============ //
    public ArrayList<ArrayList<String>> displayOrder() {

        ArrayList<ArrayList<String>> orderScreen = new ArrayList<>();

        ArrayList<String> orderBtn = new ArrayList<>();
        orderBtn.add(getOrderBtn());
        orderBtn.add(getOrderBtnInfo());
        orderScreen.add(orderBtn);

        ArrayList<String> cancelBtn = new ArrayList<>();
        cancelBtn.add(getCancelBtn());
        cancelBtn.add(getCancelBtnInfo());
        orderScreen.add(cancelBtn);
        return orderScreen;
    }

    // ============ 햄버거 메뉴 리스트로 저장 ============ //
    public ArrayList<ArrayList<Object>> displayBurgers() {
        ArrayList<ArrayList<Object>> productBurgers = new ArrayList<>();
        // <> 부분은 제네릭 타입의 매개 변수임.
        // object는 모든 클래스를 상속하기에, 어떤 객체든 저장할 수 있음

        ArrayList<Object> shackBurger = new ArrayList<>();
        shackBurger.add(getShackBurger());
        shackBurger.add(priceShackeBurgerDouble);
        shackBurger.add(getInfoShackeBurger());
        productBurgers.add(shackBurger);

        ArrayList<Object> smokeShack = new ArrayList<>();
        smokeShack.add(getSmokeShack());
        smokeShack.add(priceSmokeShack);
        smokeShack.add(getInfoSmokeShack());
        productBurgers.add(smokeShack);

        ArrayList<Object> shroomBurger = new ArrayList<>();
        shroomBurger.add(getShroomBurger());
        shroomBurger.add(priceshroomBurger);
        shroomBurger.add(getInfoshroomBurger());
        productBurgers.add(shroomBurger);
        return productBurgers;
    }

    // ============ 아이스크림 메뉴 리스트로 저장 ============ //
    public ArrayList<ArrayList<Object>> displayFrozen() {
        ArrayList<ArrayList<Object>> productFrozen = new ArrayList<>();

        ArrayList<Object> shake = new ArrayList<>();
        shake.add(getShake());
        shake.add(priceShake);
        shake.add(getInfoShake());
        productFrozen.add(shake);

        ArrayList<Object> cupsCones = new ArrayList<>();
        cupsCones.add(getCupsCones());
        cupsCones.add(priceCupsCones);
        cupsCones.add(getInfoCupsCones());
        productFrozen.add(cupsCones);

        ArrayList<Object> concretes = new ArrayList<>();
        concretes.add(getConcretes());
        concretes.add(priceConcretes);
        concretes.add(getInfoConcretes());
        productFrozen.add(concretes);
        return productFrozen;
    }
    // ============ 음료수 메뉴 리스트로 저장 ============ //
    public ArrayList<ArrayList<Object>> displayDrinks() {
        ArrayList<ArrayList<Object>> productDrinks = new ArrayList<>();

        ArrayList<Object> lemonade = new ArrayList<>();
        lemonade.add(getLemonade());
        lemonade.add(priceLemonade);
        lemonade.add(getInfoLemonade());
        productDrinks.add(lemonade);

        ArrayList<Object> icedTea = new ArrayList<>();
        icedTea.add(getIcedTea());
        icedTea.add(priceIcedTea);
        icedTea.add(getInfoIcedTea());
        productDrinks.add(icedTea);

        ArrayList<Object> fifty = new ArrayList<>();
        fifty.add(getFifty());
        fifty.add(priceFifty);
        fifty.add(getInfoFifty());
        productDrinks.add(fifty);
        return productDrinks;
    }
}