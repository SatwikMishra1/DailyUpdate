package demo.satwik;

import model.Account;
import practise.Dog;
import practise.Person;
import practise.PersonRecord;

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

        Dog dog1 = new Dog("Labrador","medium",43.4,"normal","curled");
        Dog dog2 = new Dog("pug","small",20);

        System.out.println(dog1);
        System.out.println(dog2);
        dog1.makesNoise();
        dog2.makesNoise();
        dog1.moves(33);
        dog2.moves(65);
    }
}
///conflicts using cherrypick?
// merge over cherry pick
