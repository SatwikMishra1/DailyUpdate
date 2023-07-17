package model;

import lombok.Data;

@Data
public class Account {
    private long accountNumber;
    private long accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void depositMoney(long amount){
      this.accountBalance+=amount;
        System.out.println("You deposited "+ amount +" in you account.");
        System.out.println("Your current account balance is " + this.accountBalance);
    }

    public void withdrawMoney(long amount){
      if(amount>this.accountBalance){
          System.out.println("You dont have sufficent balance to complete this transiction.");
          return;
      }
      this.accountBalance-=amount;
      System.out.println("The Transiction is successfull.");
      System.out.println("Your current account balance is " + this.accountBalance);
    }

}
