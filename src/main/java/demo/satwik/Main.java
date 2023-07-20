package demo.satwik;

import composition.CoffeeMaker;
import composition.DishWasher;
import composition.Refrigerator;
import composition.SmartKitchen;
import model.Account;
import polymorphism.Adventure;
import polymorphism.Movie;
import polymorphism.Scary;
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
        Movie movie=new Scary("The Grudge");
        movie.watchMovie();
//        Movie m=movie.getMovie("hum sath hai","A");
//        m.watchMovie();
//        Object mm=movie.getMovie("bhoot police","S");
//        Movie mhh=(Movie) mm;
//        mhh.watchMovie();
        Object muvee = movie.getMovie("intekam","A");
        Adventure adventure=new Adventure("dhammal");
        if(adventure instanceof Movie){
            System.out.println("this is a movie");
        }
        if(movie instanceof Adventure){
            ((Adventure) muvee).watchMovie();
        }
    }
}
///conflicts using cherrypick?
// merge over cherry pick
