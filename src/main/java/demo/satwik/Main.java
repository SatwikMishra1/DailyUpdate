package demo.satwik;

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
        SalariedEmployee salariedEmployee=new SalariedEmployee("chagan","28/04/1977","28/04/2077",123456,"28/04/2000",1500000,false);
        System.out.println(salariedEmployee.getAge());
        salariedEmployee.collectPay();
        salariedEmployee.terminate();
        salariedEmployee.retire();
        HourlyEmployee hourlyEmployee=new HourlyEmployee("magan","28/04/1990","28/04/2077",123456,"28/04/2000",1500);
        System.out.println(hourlyEmployee.getAge());
        hourlyEmployee.collectPay();
        hourlyEmployee.terminate();
        hourlyEmployee.getDoublePay();
    }
}
///conflicts using cherrypick?
// merge over cherry pick
