package Kiosk_v0_2;

import Kiosk_v0_2.bugerAbstract.AbstractBurgers;
import Kiosk_v0_2.bugerAbstract.ShackBurger;
import Kiosk_v0_2.bugerAbstract.ShroomBurger;
import Kiosk_v0_2.bugerAbstract.SmokeBurger;

public class AddOption {
    public void addOption(int choiceNum) {
        switch (choiceNum) {
            case 1:
                AbstractBurgers abstractBurgers = new ShackBurger();
                abstractBurgers.choiceOption(choiceNum);
                break;
            case 2:
                abstractBurgers = new SmokeBurger();
                abstractBurgers.choiceOption(choiceNum);
                break;
            case 3:
                abstractBurgers = new ShroomBurger();
                abstractBurgers.choiceOption(choiceNum);
                break;
        }
    }
}