package Kiosk_v0_2;

import java.util.ArrayList;

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
        ArrayList<ArrayList<String>> burgerItem = product.displayBurgers();
        System.out.println("[ BURGERS ]");
        for (int i = 0; i < burgerItem.size(); i++) {
            ArrayList<String> row = burgerItem.get(i);
            System.out.print(i + 1 + ".");
            for (String burgerInfo : row) {
                System.out.print(burgerInfo + " " + "  |  "); // 추후 간격 맞춰보기
            }
            System.out.println();
        }
    }

    public void frozenScreen() {
        ArrayList<ArrayList<String>> frozenItem = product.displayFrozen();
        System.out.println("[ FROZEN CUSTARD ]");
        // [[aa, bb, cc], [ee, ff, gg], [hh, ii, jj]]
        for (int i = 0; i < frozenItem.size(); i++) {
            System.out.print(i + 1 + ". ");
            ArrayList<String> row = frozenItem.get(i);
            for ( String frozenInfo : row ) {
                System.out.print(frozenInfo + " " + "  |  ");
            }
            System.out.println();
        }
    }
    public void drinksScreen() {
        ArrayList<ArrayList<String>> drinksItem = product.displayDrinks();
        System.out.println("[ DRINKS ]");
        for (int i = 0; i < drinksItem.size(); i++) {
            System.out.print(i + 1 + ". ");
            ArrayList<String> row = drinksItem.get(i);
            for ( String drinksInfo : row) {
                System.out.print(drinksInfo + " " + "  |  ");
            }
            System.out.println();
        }
    }


}
