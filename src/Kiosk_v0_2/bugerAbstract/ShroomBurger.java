package Kiosk_v0_2.bugerAbstract;

public class ShroomBurger extends AbstractBurgers {
    public double ShroomBurgerPrice = 8.9;

    @Override
    public void choiceOption() {

        boolean run = true;
        while (run) {
            switch (sc.nextInt()) {
                case 1:
                    ShroomBurgerPrice = ShroomBurgerPrice + getBeefPrice();
                    System.out.println("패티를 추가하였습니다.");
                    continue;

                case 2:
                    ShroomBurgerPrice = ShroomBurgerPrice + getCheesePrice();
                    System.out.println("치즈를 추가하였습니다.");
                    continue;

                case 3:
                    System.out.println("종료");
                    run = false;
            }
        }
        System.out.println("슈룸버거 가격은 " + ShroomBurgerPrice);
    }
}
