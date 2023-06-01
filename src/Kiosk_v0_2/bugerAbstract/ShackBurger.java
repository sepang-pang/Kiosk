package Kiosk_v0_2.bugerAbstract;


public class ShackBurger extends AbstractBurgers {
    @Override
    public void choiceOption() {
        boolean run = true;
        while (run) {
            switch (sc.nextInt()) {
                case 1:
                    shackBurgerPrice = shackBurgerPrice + beefPrice;
                    System.out.println("패티를 추가하였습니다.");
                    continue;

                case 2:
                    shackBurgerPrice = shackBurgerPrice + cheesePrice;
                    System.out.println("치즈를 추가하였습니다.");
                    continue;

                case 3:
                    System.out.println("종료");
                    run = false;
            }
        }

    }
}