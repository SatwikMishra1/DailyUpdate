package demo.satwik;

import composition.CoffeeMaker;
import composition.DishWasher;
import composition.Refrigerator;
import composition.SmartKitchen;
import model.Account;
import practise.*;

// java fx
// databases
//26 27

// java => 100 hours => 50 hours +50 hours (exercise) ==> 10 hours per day ==> 2 weeks(for java basics)




//MAVEN
// 1->5 and then maven repositories(12) => 3 hours => 1 day


//SPRING BOOT
// 1 week would be enough

//focus on streams
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker=new CoffeeMaker(false);
        Refrigerator refrigerator=new Refrigerator(false);
        DishWasher dishWasher=new DishWasher(false);
        SmartKitchen smartKitchen=new SmartKitchen(coffeeMaker,dishWasher,refrigerator);
        smartKitchen.addWater();
        smartKitchen.pourMilk();
        smartKitchen.loadDishWasher();
    }
}
///conflicts using cherrypick?
// merge over cherry pick
