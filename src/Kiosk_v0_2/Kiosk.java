package Kiosk_v0_2;


import java.util.*;

public class Kiosk {
    private final HashMap<String, String> fistMenu = new LinkedHashMap<>();
    private final HashMap<String, String> burgersMenu = new LinkedHashMap<>();

    public HashMap<String, String> getBurgersMenu() {
        return burgersMenu;
    }


    public Kiosk() {

        // 초기 메뉴판 세팅
        fistMenu.put("1. Burgers", "앵거스 비프 통살을 다져만든 버거");
        fistMenu.put("2. Frozen Custard", "매장에서 신선하게 만드는 아이스크림");
        fistMenu.put("3. Drinks", "매장에서 직접 만드는 음료");

        // burgersMenu 메뉴판 설정
        burgersMenu.put("1. ShackBurger ", " | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        burgersMenu.put("2. SmokeShack ", " | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        burgersMenu.put("3. Shroom Burger ", " | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");

        //

    }

    Scanner scanner = new Scanner(System.in);

    public int fistDisplayMenu(boolean answer) {
        // 초기 메뉴 출력
        if (answer) {
            System.out.println("[ BURGERS MENU ]");
            for (String key : fistMenu.keySet()) {
                System.out.println(key + "| " + fistMenu.get(key));
            }
        }
        else {
            System.out.println("주문을 취소합니다.");
        }
        return scanner.nextInt();
    }
}
