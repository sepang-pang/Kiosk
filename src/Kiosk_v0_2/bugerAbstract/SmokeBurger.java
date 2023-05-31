package Kiosk_v0_2.bugerAbstract;

public class SmokeBurger extends AbstractBurgers {
    public double SmokeShackPrice = 8.9;

    @Override
    public void choiceOption() {

        boolean run = true;
        while (run) {
            switch (sc.nextInt()) {
                case 1:
                    SmokeShackPrice = SmokeShackPrice + getBeefPrice();
                    System.out.println("패티를 추가하였습니다.");
                    continue;

                case 2:
                    SmokeShackPrice = SmokeShackPrice + getCheesePrice();
                    System.out.println("치즈를 추가하였습니다.");
                    continue;

                case 3:
                    System.out.println("종료");
                    run = false;
            }
        }
        System.out.println("스모크버거 가격은 " + SmokeShackPrice);
    }
}
