package demo.satwik;

import model.Account;

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
        Account account=new Account();
        account.setAccountNumber(123466);
        account.setAccountBalance(10000);
        account.setPhoneNumber("9140738454");
        account.setEmail("satwik@gmail.com");
        account.depositMoney(1000);
        account.withdrawMoney(200);
    }
}
///conflicts using cherrypick?
// merge over cherry pick
