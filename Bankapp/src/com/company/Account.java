package com.company;


import java.util.UUID;

//State
public class Account {
    private UUID accNr;
    private int Balance;
    private String Banktype;
    private int deposit;

//Constructor
public Account(){
    accNr = accNr;
    Balance = 0;
    Banktype = "Debit";

}
//Behaviour
    public int getBalance() {
        return Balance;
    }

    public boolean Deposit(int amount){
    Balance = Balance + amount;
    return true;
    }
    public boolean Withdraw(int amount) {
        if (amount > Balance) {
            return false;
        } else {
            Balance = Balance - amount;
            return true;
        }
    }
    public String Accountinfo(){
    String accinfo = "Current Balance: " + Balance;
    return accinfo;
    }
}
