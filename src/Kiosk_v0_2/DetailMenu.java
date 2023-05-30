package Kiosk_v0_2;

public class DetailMenu extends Kiosk {

    public void secondDisplayMenu(int orderNum) {
        switch (orderNum) {
            case 1:
                // 햄버거 메뉴들
                System.out.println("[ SHAKESHACK MENU ]");
                for (String key : getBurgersMenu().keySet()) {
                    System.out.println(key + getBurgersMenu().get(key));
                }
                AddOption addOption = new AddOption();
                addOption.addOption(scanner.nextInt());
                break;
            case 2:
                System.out.println("아이스크림 메뉴");
                break;
            case 3:
                System.out.println("음료수 메뉴");
                break;

        }

    }

}

