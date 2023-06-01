package Kiosk_v0_2;

import java.util.ArrayList;
import java.util.Objects;

public class Screen {
    Product product = new Product();

    public void initialScreen() { // 최초 조우 메뉴 화면 //
        // =========== 메뉴 출력 =========== //
        ArrayList<ArrayList<String>> menuItem = product.displayMenu();
        System.out.println("[ SHAKESAKE ]");
        for (int i = 0; i < menuItem.size(); i++) {
            ArrayList<String> row = menuItem.get(i);
            System.out.print(i + 1 + ".");
            for (String menuInfo : row) {
                System.out.print(menuInfo + " " + "  |  "); // 추후 간격 맞춰보기
            }
            System.out.println();
        }
        System.out.println();

        // =========== 오더 출력 =========== //
        ArrayList<ArrayList<String>> orderItem = product.displayOrder();
        System.out.println("[ ORDER ]");
        for (int i = 0; i < orderItem.size(); i++) {
            ArrayList<String> row = orderItem.get(i);
            System.out.print(i + 4 + ".");
            for (String orderInfo : row) {
                System.out.print(orderInfo + " " + "  |  "); // 추후 간격 맞춰보기
            }
            System.out.println();
        }
    }

    // =========== 햄버거 메뉴 목록 =========== //
    public void burgersScreen() {
        ArrayList<ArrayList<Object>> burgerItem = product.displayBurgers();
        System.out.println("[ BURGERS ]");
        for (int i = 0; i < burgerItem.size(); i++) {
            // 버거아이템의 사이즈, 즉 [[a, b, c], [e, f, g], [h, i, j]] 와 같은 리스트가 있다면, 해당 리스트의 사이즈 (i < 3) 만큼 반복
            ArrayList<Object> row = burgerItem.get(i);
            // row 라는 리스트를 생성하여 버거아이템의 위치의 따른 값 (i)를 순차적으로 입력
            // 즉, get(0) 이라면, [a, b, c] 리스트를 row에 저장
            System.out.print(i + 1 + ".");
            for (Object burgerInfo : row) {
                // [a, b, c] 로 구성된 요소를 하나씩 burgerInfo에 입력
                // 예를 들어 첫번쨰 루프시 burgerInfo = "a" 임
                // burgerInfo 출력
                // 다음은 burgerInfo에 "b" 입력, 이후 반복
                if (burgerInfo instanceof Double) {
                    // row에서 넘어온 burgerInfo 요소의 타입을 비교
                    // Double 이면 아래와 같이 출력하자 !!
                    // double이 Double로 자동박싱 ?
                    // Double 래퍼클래스가 double을 감싸고 있기에 가능 ?
                    // Double 래퍼클래스가 double을 감싸고 있기에 자동 박싱이 가능 ?
                    System.out.print("W " + burgerInfo + " " + "  |  ");
                } else {
                    System.out.print(burgerInfo + " " + "  |  "); // 추후 간격 맞춰보기
                }
            }
            System.out.println();
        }
    }

    public void frozenScreen() {
        ArrayList<ArrayList<Object>> frozenItem = product.displayFrozen();
        System.out.println("[ FROZEN CUSTARD ]");
        for (int i = 0; i < frozenItem.size(); i++) {
            ArrayList<Object> row = frozenItem.get(i);
            System.out.print(i + 1 + ".");
            for (Object frozenInfo : row) {
                if (frozenInfo instanceof Double) {
                    System.out.print("W " + frozenInfo + " " + "  |  ");
                } else {
                    System.out.print(frozenInfo + " " + "  |  "); // 추후 간격 맞춰보기
                }
            }
            System.out.println();
        }
    }

    public void drinksScreen() {
        ArrayList<ArrayList<Object>> drinksItem = product.displayDrinks();
        System.out.println("[ DRINKS ]");
        for (int i = 0; i < drinksItem.size(); i++) {
            System.out.print(i + 1 + ". ");
            ArrayList<Object> row = drinksItem.get(i);
            for (Object drinksInfo : row) {
                if (drinksInfo instanceof Double) {
                    System.out.print("W " + drinksInfo + " " + "  |  ");
                } else {
                    System.out.print(drinksInfo + " " + "  |  ");
                }
            }
            System.out.println();
        }
    }
}
