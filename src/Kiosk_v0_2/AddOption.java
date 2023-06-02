package Kiosk_v0_2;

import Kiosk_v0_2.bugerAbstract.AbstractBurgers;
import Kiosk_v0_2.bugerAbstract.ShackBurger;
import Kiosk_v0_2.bugerAbstract.SmokeBurger;
import Kiosk_v0_2.bugerAbstract.ShroomBurger;
import Kiosk_v0_2.drinkAbstract.AbstractDrink;
import Kiosk_v0_2.drinkAbstract.Fifty;
import Kiosk_v0_2.drinkAbstract.IcedTea;
import Kiosk_v0_2.drinkAbstract.Lemonade;
import Kiosk_v0_2.frozenAbstract.AbstractFrozen;
import Kiosk_v0_2.frozenAbstract.Concreates;
import Kiosk_v0_2.frozenAbstract.CupsCones;
import Kiosk_v0_2.frozenAbstract.Shake;
import Kiosk_v0_2.Kiosk;

import java.util.Scanner;

public class AddOption {
    Scanner scanner = new Scanner(System.in);


    public void addBugersOption() {
        while (true) {
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
                default:
                    System.out.println("잘못된 입력입니다.");
                    addBugersOption();
                    continue;
            }
            break;
        }
    }

    public void addFrozenOption() {
        while (true) {
            switch (scanner.nextInt()) {
                case 1:
                    AbstractFrozen abstractFrozen = new Shake(new Cart());
                    abstractFrozen.choiceOption();
                    break;
                case 2:
                    abstractFrozen = new CupsCones(new Cart());
                    abstractFrozen.choiceOption();
                    break;
                case 3:
                    abstractFrozen = new Concreates(new Cart());
                    abstractFrozen.choiceOption();
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    addFrozenOption();
                    continue;
            }
            break;
        }
    }

    public void addDrinkOption() {
        while (true) {
            switch (scanner.nextInt()) {
                case 1:
                    AbstractDrink abstractDrinks = new Lemonade(new Cart());
                    abstractDrinks.choiceOption();
                    break;
                case 2:
                    abstractDrinks = new IcedTea(new Cart());
                    abstractDrinks.choiceOption();
                    break;
                case 3:
                    abstractDrinks = new Fifty(new Cart());
                    abstractDrinks.choiceOption();
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    addDrinkOption();
                    continue;
            }
            break;
        }
    }
}