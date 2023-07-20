package demo.satwik;

import composition.CoffeeMaker;
import composition.DishWasher;
import composition.Refrigerator;
import composition.SmartKitchen;
import model.Account;
import polymorphism.*;
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
      Car car=new Car("this is a sedan");
      ElectricCar electricCar=new ElectricCar("this is a sedan",22.15,12);
      electricCar.drive();
      HybridCar hybridCar=new HybridCar("this is a Hybrid",22.15,12,10);
      hybridCar.drive();
      GasPoweredCar gasPoweredCar=new GasPoweredCar("this is a Hybrid",22.15,2);
      gasPoweredCar.drive();
    }
}
///conflicts using cherrypick?
// merge over cherry pick
