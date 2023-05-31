package Kiosk_v0_2;

public class DetailMenu extends Kiosk {

    public void secondDisplayMenu(int orderNum) {
        switch (orderNum) {
            case 1:
                // 햄버거 메뉴들
                System.out.println("[ BURGERS MENU ]");
                for (String key : getBurgersMenu().keySet()) {
                    System.out.println(key + getBurgersMenu().get(key));
                }
                AddOption addOptionBurgers = new AddOption();
                addOptionBurgers.addBugersOption(scanner.nextInt());
                break;

            case 2:
                System.out.println("[ FROZEN CUSTARD MENU ]");
                for (String key : getIceCreamMenu().keySet()) {
                    System.out.println(key + getIceCreamMenu().get(key));
                }
                AddOption addOptionFrozen = new AddOption();
                addOptionFrozen.addFrozenOption(scanner.nextInt());
                break;

            case 3:
                System.out.println("[ DRINKS MENU ]");
                for (String key : getDrinkMenu().keySet()) {
                    System.out.println(key + getDrinkMenu().get(key));
                }
                AddOption addOptionDrink = new AddOption();
                addOptionDrink.addDrinkOption(scanner.nextInt());
                break;

        }

    }

}

