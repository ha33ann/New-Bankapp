package com.company;

import java.util.ArrayList;
import java.util.List;

public class Costumer {
    //State
    private int Personnummer;
    private String Name;
    private List<Account> Accounts;

    //Constructor
    public Costumer(int Personnummer, String Name, List<Account> Accounts){
        Personnummer = Personnummer;
        Name = Name;
        Accounts = Accounts;

    }


    public Costumer(int personnummer, String name) {
        Personnummer = personnummer;
        Name = name;
        Accounts = new ArrayList<>();
    }

    //Behaviour
    public void AddAccount(Account acc){
        Accounts.add(acc);
    }
    public int getPersonnummer(){
        return Personnummer;
    }
    public String getName(){
        return Name;
    }
    public List<Account> getAccounts(){
        return Accounts;
    }

    @Override
    public String toString() {
        return "Personnummer: " + Personnummer +
                ", Namn: " + Name + "" +
                ", Accounts: " + Accounts.size() + ", " +
                "Banktype: Debit";

    }
    }
