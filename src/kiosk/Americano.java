package kiosk;

public class Americano extends AbstractProduct {
    public int americanoPrice = 5000;

    @Override
    public void choiceOption(int num) {
        boolean run = true;
        while (run) {
            switch (sc.nextInt()) {
                case 1:
                    americanoPrice = americanoPrice + icePrice;
                    continue;

                case 2:
                    americanoPrice = americanoPrice + sizeUpPrice;
                    continue;

                case 3:
                    americanoPrice = americanoPrice + addSyrupPrice;
                    continue;

                case 4:
                    System.out.println("종료");
                    run = false;
            }
        }
        System.out.println("아메리카노 가격은 " + americanoPrice);
    }
}



