package Kiosk_v0_2;


import java.util.*;

public class Kiosk {
    private final HashMap<String, String> fistMenu = new LinkedHashMap<>();
    private final HashMap<String, String> burgersMenu = new LinkedHashMap<>();
    private final HashMap<String, String> iceCreamMenu = new LinkedHashMap<>();
    private final HashMap<String, String> drinkMenu = new LinkedHashMap<>();

    public HashMap<String, String> getBurgersMenu() {
        return burgersMenu;
    }
    public HashMap<String, String> getIceCreamMenu() {
        return iceCreamMenu;
    }
    public HashMap<String, String> getDrinkMenu() {
        return drinkMenu;
    }

    public Kiosk() {

        // 초기 메뉴판 세팅
        fistMenu.put("1. Burgers", "앵거스 비프 통살을 다져만든 버거");
        fistMenu.put("2. Frozen Custard", "매장에서 신선하게 만드는 아이스크림");
        fistMenu.put("3. Drinks", "매장에서 직접 만드는 음료");

        // 햄버거 목록 설정
        burgersMenu.put("1. ShackBurger ", " | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        burgersMenu.put("2. SmokeShack ", " | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        burgersMenu.put("3. Shroom Burger ", " | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");

        // 아이스크림 목록
        iceCreamMenu.put("1. Shake ", " | W 5.9 | 바닐라, 초콜릿, 스트로베리, 커피, 카라멜");
        iceCreamMenu.put("2. Cups & Cones ", " | W 4.9 (S)  W 5.9 (L) | 바닐라, 초콜릿");
        iceCreamMenu.put("3. Concretes ", " | W 5.9 (S)  W 8.9 (L) | 쉑 어택, 허니 버터 크런치, 베러 게더");

        // 음료 목록
        drinkMenu.put("1. Shake-made Lemonade ", " | W 3.9 (R)  W 4.5 (L) | 오리지날, 시즈널");
        drinkMenu.put("2. Fresh Brewed Iced Tea ", " | W 3.4 (R)  W 3.9 (L) | 직접 유기농 홍차를 우려낸 아이스티");
        drinkMenu.put("3. Fifty / Fifty ", " | W 3.5 (R)  W 4.4 (L) | 레모네이드와 아이스티의 만남");

    }

    Scanner scanner = new Scanner(System.in);

    public int fistDisplayMenu(boolean isAnswer) {
        // 초기 메뉴 출력
        if (isAnswer) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (String key : fistMenu.keySet()) {
                System.out.println(key + " | " + fistMenu.get(key));
            }
        }
        else {
            System.out.println("주문을 취소합니다.");
        }
        return scanner.nextInt();
    }
}
