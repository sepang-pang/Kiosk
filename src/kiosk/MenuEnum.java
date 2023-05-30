package kiosk;

import java.util.Scanner;

public enum MenuEnum {

    AMERICANO("아메리카노", "아메리카노입니다.", 5000),
    CAFE_MOCHA("카페모카", "카페모카입니다", 5000),
    CAFE_LATTE("카페라떼", "카페라떼입니다.", 6000);

    private final String coffeeName;
    private final String intro;
    private final int price;

    MenuEnum(String coffeeName, String intro, int price) {
        this.coffeeName = coffeeName;
        this.intro = intro;
        this.price = price;
    }

    public static int displayMenu(boolean answerBoolean) {
        int[] intArr = new int[3];
        if (answerBoolean) {
            for (int i = 0; i < 3; i++) {
                intArr[i] = i + 1;
            }
            System.out.println(intArr[0] + "." + AMERICANO.coffeeName + " | " + AMERICANO.intro + " | " + AMERICANO.price);
            System.out.println(intArr[1] + "." + CAFE_MOCHA.coffeeName + " | " + CAFE_MOCHA.intro + " | " + CAFE_MOCHA.price);
            System.out.println(intArr[2] + "." + CAFE_LATTE.coffeeName + " | " + CAFE_LATTE.intro + " | " + CAFE_LATTE.price);

        }
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
