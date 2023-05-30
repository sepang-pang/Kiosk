package Kiosk_v0_2.bugerAbstract;

public class ShackBurger extends AbstractBurgers {
    public double shackBurgerPrice = 6.9;
    public double SmokeShackPrice = 8.9;

    @Override
    public void choiceOption(int num) {

        boolean run = true;
        while (run) {
            switch (sc.nextInt()) {
                case 1:
                    shackBurgerPrice = shackBurgerPrice + getBeefPrice();
                    System.out.println("패티를 추가하였습니다.");
                    continue;

                case 2:
                    shackBurgerPrice = shackBurgerPrice + getCheesePrice();
                    System.out.println("치즈를 추가하였습니다.");
                    continue;

                case 3:
                    System.out.println("종료");
                    run = false;
            }
        }
        System.out.println("쉑쉑버거 가격은 " + shackBurgerPrice);
    }
}
