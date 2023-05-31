package Kiosk_v0_2.drinkAbstract;

public class IcedTea extends AbstractDrink {

    public double icedTeaPrice = 3.4;

    @Override
    public void choiceOption(int num) {
        boolean run = true;
        System.out.println("=========================");
        System.out.println("|" + " 1. 사이즈 업" + "  :   + 500원" + " |");
        System.out.println("|" + " 2. 얼음 추가" + "  :   + 500원" + " |");
        System.out.println("|" + " 3. 종    료" + "            |");
        System.out.println("=========================");

        while (run) {

            switch (sc.nextInt()) {
                case 1:
                    icedTeaPrice = icedTeaPrice + getIcedTeaLarge ();
                    System.out.println("L 사이즈로 변경");
                    continue;

                case 2:
                    icedTeaPrice = icedTeaPrice + getAddIce();
                    System.out.println("얼음 추가");
                    continue;

                case 3:
                    System.out.println("종료");
                    run = false;
            }
        }
        System.out.println("아이스티 가격은 " + icedTeaPrice);
    }


}
