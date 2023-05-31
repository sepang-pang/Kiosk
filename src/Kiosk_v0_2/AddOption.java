package Kiosk_v0_2;

import Kiosk_v0_2.bugerAbstract.AbstractBurgers;
import Kiosk_v0_2.bugerAbstract.ShackBurger;
import Kiosk_v0_2.bugerAbstract.ShroomBurger;
import Kiosk_v0_2.bugerAbstract.SmokeBurger;
import Kiosk_v0_2.drinkAbstract.AbstractDrink;
import Kiosk_v0_2.drinkAbstract.Fifty;
import Kiosk_v0_2.drinkAbstract.IcedTea;
import Kiosk_v0_2.drinkAbstract.Lemonade;
import Kiosk_v0_2.frozenAbstract.AbstractFrozen;
import Kiosk_v0_2.frozenAbstract.Concreates;
import Kiosk_v0_2.frozenAbstract.CupsCones;
import Kiosk_v0_2.frozenAbstract.Shake;

import java.util.Scanner;

public class AddOption {
    Scanner scanner = new Scanner(System.in);
    public void addBugersOption() {

        switch (scanner.nextInt()) {
            case 1:
                AbstractBurgers abstractBurgers = new ShackBurger();
                abstractBurgers.choiceOption();
                break;
            case 2:
                abstractBurgers = new SmokeBurger();
                abstractBurgers.choiceOption();
                break;
            case 3:
                abstractBurgers = new ShroomBurger();
                abstractBurgers.choiceOption();
                break;

        }
    }

    public void addFrozenOption() {
        switch (scanner.nextInt()) {
            case 1:
                AbstractFrozen abstractFrozen = new Shake();
                abstractFrozen.choiceOption();
                break;
            case 2:
                abstractFrozen = new CupsCones();
                abstractFrozen.choiceOption();
                break;
            case 3:
                abstractFrozen = new Concreates();
                abstractFrozen.choiceOption();
                break;
        }
    }

    public void addDrinkOption() {
        switch (scanner.nextInt()) {
            case 1:
                AbstractDrink abstractDrinks = new Lemonade();
                abstractDrinks.choiceOption();
                break;
            case 2:
                abstractDrinks = new IcedTea();
                abstractDrinks.choiceOption();
                break;
            case 3:
                abstractDrinks = new Fifty();
                abstractDrinks.choiceOption();
                break;
        }
    }
}