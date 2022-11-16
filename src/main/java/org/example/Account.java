package org.example;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Account {
    private int balance;
    private String name;
    public void setBalance(int inputBalance) {
        if (inputBalance < 0) {

        this.balance = 0;
        } else {
            this.balance = inputBalance;
        }
    }
    public void depositBalance(int depo) {
        if ( depo > 0 ) {
            this.setBalance( this.getBalance() + depo);
        } else {
            System.out.println("Negative depo");
        }
    }

    public void withdrawal(int money){
        if (money>this.getBalance()){
            System.out.println("You don't have enough money on your account");
        } else {
            this.setBalance(this.getBalance() - money);
        }
    }

}




