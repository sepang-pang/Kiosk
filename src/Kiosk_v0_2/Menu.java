package Kiosk_v0_2;

public class Menu {

//    // ===================== 메뉴 타이틀 ====================== //
//    private String menuTitle = "[ SHAKESHACK MENU ]";
//    private String orderTitle = "[ ORDER MENU ]";
//    public String getMenuTitle() {
//        return menuTitle;
//    }
//
//    public String getOrderTitle() {
//        return orderTitle;
//    }
//

    // ==================== 메뉴 상품 목록 ==================== //
    private String burgers = "Burgers";
    private String frozen = "Frozen Custard";
    private String drinks = "Drinks";

    public String getBurgers() {
        return burgers;
    }

    public String getFrozen() {
        return frozen;
    }

    public String getDrinks() {
        return drinks;
    }

    // ==================== 상품 상세 정보 ==================== //
    private String burgersInfo = "앵거스 비프 통살을 다져만든 버거";
    private String frozeInfo = "매장에서 신선하게 만드는 아이스크림";
    private String drinksInfo = "매장에서 직접 만드는 음료";

    public String getBurgersInfo() {
        return burgersInfo;
    }

    public String getFrozeInfo() {
        return frozeInfo;
    }

    public String getDrinksInfo() {
        return drinksInfo;
    }

    // ==================== 오더 메뉴 버튼 ==================== //
    private String orderBtn = "Order ";
    private String orderBtnInfo = "장바구니를 확인 후 주문합니다.";
    private String cancelBtn = "Cancel";
    private String cancelBtnInfo = "진행중인 주문을 취소합니다.";

    public String getCancelBtn() {
        return cancelBtn;
    }

    public String getCancelBtnInfo() {
        return cancelBtnInfo;
    }

    public String getOrderBtn() {
        return orderBtn;
    }

    public String getOrderBtnInfo() {
        return orderBtnInfo;
    }

    // ==================== 햄버거 제품 목록 ==================== //
    private String shackBurger = "Shack Burger";
    private String smokeShack = "Smoke Shack";
    private String shroomBurger = " Shroom Burger";

    public String getShackBurger() {
        return shackBurger;
    }

    public String getSmokeShack() {
        return smokeShack;
    }

    public String getShroomBurger() {
        return shroomBurger;
    }

    // ==================== 햄버거 제품 설명 ==================== //
    private String infoShackeBurger = "토마토, 양상추, 쉑소스가 토핑된 치즈버거";
    private String infoSmokeShack = "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거";
    private String infoshroomBurger = "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거";

    public String getInfoShackeBurger() {
        return infoShackeBurger;
    }

    public String getInfoSmokeShack() {
        return infoSmokeShack;
    }

    public String getInfoshroomBurger() {
        return infoshroomBurger;
    }

    // ==================== 아이스크림 목록 ==================== //
    private String shake = "Shake";
    private String cupsCones = "Cups & Cones";
    private String concretes = "Concretes";


    public String getShake() {
        return shake;
    }
    public String getCupsCones() {
        return cupsCones;
    }

    public String getConcretes() {
        return concretes;
    }

    // ==================== 아이스크림 설명 ==================== //
    private String infoShake = "바닐라, 초콜릿, 스트로베리, 커피, 카라멜";
    private String infoCupsCones = "바닐라, 초콜릿";
    private String infoConcretes = "쉑 어택, 허니 버터 크런치, 베러 게더";

    public String getInfoShake() {
        return infoShake;
    }
    public String getInfoCupsCones() {
        return infoCupsCones;
    }
    public String getInfoConcretes() {
        return infoConcretes;
    }

    // ==================== 음료수 목록 ==================== //
    private String lemonade = "Shake-made Lemonade";
    private String icedTea = "Fresh Brewed Iced Tea";
    private String fifty = "Fifty / Fifty";

    public String getLemonade() {
        return lemonade;
    }
    public String getIcedTea() {
        return icedTea;
    }
    public String getFifty() {
        return fifty;
    }

    // ==================== 음료수 설명 ==================== //
    private String infoLemonade =  "오리지날, 시즈널";
    private String infoIcedTea = "직접 유기농 홍차를 우려낸 아이스티";
    private String infoFifty = "레모네이드와 아이스티의 만남";

    public String getInfoLemonade() {
        return infoLemonade;
    }
    public String getInfoIcedTea() {
        return infoIcedTea;
    }
    public String getInfoFifty() {
        return infoFifty;
    }

    // ==================== 반복 문장 ==================== //
    public String choiceErrorMessage = "잘못된 입력입니다. ( Y / N ) 중 하나를 선택해주세요.";
    public String errorInputMassage = "잘못된 입력입니다." ;
}