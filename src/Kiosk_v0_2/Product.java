package Kiosk_v0_2;

import java.util.ArrayList;

public class Product extends Menu {
    // ============ 햄버거 가격 ============ //
    private String priceShackeBurger = "W 6.9";
    private String priceSmokeShack = "W 8.9";
    private String priceshroomBurger = "W 9.4";

    // ============ 아이스크림 가격 ============ //
    private String priceShake = "W 5.9";
    private String priceCupsCones = "W 4.9 (S)  W 5.9 (L)";
    private String priceConcretes = "W 5.9 (S)  W 8.9 (L)";

    // ============ 음료수 가격 ============ //
    private String priceLemonade = "W 3.9 (R)  W 4.5 (L)";
    private String priceIcedTea = "W 3.4 (R)  W 3.9 (L)";
    private String priceFifty = "W 3.5 (R)  W 4.4 (L)";

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
    public ArrayList<ArrayList<String>> displayBurgers() {
        ArrayList<ArrayList<String>> productBurgers = new ArrayList<>();

        ArrayList<String> shackBurger = new ArrayList<>();
        shackBurger.add(getShackBurger());
        shackBurger.add(priceShackeBurger);
        shackBurger.add(getInfoShackeBurger());
        productBurgers.add(shackBurger);

        ArrayList<String> smokeShack = new ArrayList<>();
        smokeShack.add(getSmokeShack());
        smokeShack.add(priceSmokeShack);
        smokeShack.add(getInfoSmokeShack());
        productBurgers.add(smokeShack);

        ArrayList<String> shroomBurger = new ArrayList<>();
        shroomBurger.add(getShroomBurger());
        shroomBurger.add(priceshroomBurger);
        shroomBurger.add(getInfoshroomBurger());
        productBurgers.add(shroomBurger);
        return productBurgers;
    }

    // ============ 아이스크림 메뉴 리스트로 저장 ============ //
    public ArrayList<ArrayList<String>> displayFrozen() {
        ArrayList<ArrayList<String>> productFrozen = new ArrayList<>();

        ArrayList<String> shake = new ArrayList<>();
        shake.add(getShake());
        shake.add(priceShake);
        shake.add(getInfoShake());
        productFrozen.add(shake);

        ArrayList<String> cupsCones = new ArrayList<>();
        cupsCones.add(getCupsCones());
        cupsCones.add(priceCupsCones);
        cupsCones.add(getInfoCupsCones());
        productFrozen.add(cupsCones);

        ArrayList<String> concretes = new ArrayList<>();
        concretes.add(getConcretes());
        concretes.add(priceConcretes);
        concretes.add(getInfoConcretes());
        productFrozen.add(concretes);
        return productFrozen;
    }
    // ============ 음료수 메뉴 리스트로 저장 ============ //
    public ArrayList<ArrayList<String>> displayDrinks() {
        ArrayList<ArrayList<String>> productDrinks = new ArrayList<>();

        ArrayList<String> lemonade = new ArrayList<>();
        lemonade.add(getLemonade());
        lemonade.add(priceLemonade);
        lemonade.add(getInfoLemonade());
        productDrinks.add(lemonade);

        ArrayList<String> icedTea = new ArrayList<>();
        icedTea.add(getIcedTea());
        icedTea.add(priceIcedTea);
        icedTea.add(getInfoIcedTea());
        productDrinks.add(icedTea);

        ArrayList<String> fifty = new ArrayList<>();
        fifty.add(getFifty());
        fifty.add(priceFifty);
        fifty.add(getInfoFifty());
        productDrinks.add(fifty);
        return productDrinks;
    }
}