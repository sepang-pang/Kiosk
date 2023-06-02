package Kiosk_v0_2;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Cart {
    private static ArrayList<ArrayList<Object>> items = new ArrayList<>();


    public Cart() {
    }

    public static void addToCart(Object itemName, double itemPrice, Object... itemDetails) {
        ArrayList<Object> item = new ArrayList<>();
        item.add(itemName);
        item.add(itemPrice);
        item.addAll(Arrays.asList(itemDetails)); // 가변인자로 받은 요소를 유연하게 삽입하기 위해 asList로 변환 후 adALL로 삽입
        items.add(item);
    }


    public void printCart() {

        ArrayList<ArrayList<Object>> item = items;
        System.out.println("[Cart]");
        for (int i = 0; i < item.size(); i++) {
            System.out.print(i + 1 + ". ");
            ArrayList<Object> row = item.get(i);
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


    public void printTotalPrice() {
        double total = 0.0;
        for (ArrayList<Object> item : items) {
            double itemPrice = (double) item.get(1);
            total += itemPrice;
        }
        System.out.println();
        System.out.println("[ TOTAL ] ");
        System.out.println("W" + total);
    }



    public void clearCart() {
        items.clear();
    }
}