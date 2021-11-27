package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Account> customerAccounts = new ArrayList<>();

        Bank b1 = new Bank(" Swedbank");
        b1.addCustomer(new Costumer(1991, "John"));
        b1.addCustomer(new Costumer(1992, "Fredrik"));
        b1.addCustomer(new Costumer(1993, "Simon"));
        b1.addCustomer(new Costumer(1994, "Gustav"));

        b1.AddAccount(1991);
        b1.AddAccount(1991);
        b1.AddAccount(1992);
        b1.AddAccount(1992);
        b1.AddAccount(1992);
        b1.AddAccount(1993);
        b1.AddAccount(1994);
        b1.AddAccount(1994);
        b1.AddAccount(1995);

        System.out.println("BANK:" + b1.getBankName());

        System.out.println();

        Account a1 = new Account();

        var customerinfo1 = b1.Getcostumer(0);
        System.out.println(b1.Getcostumer(0));
        System.out.println("BEFORE DEPOSIT: " + a1.getBalance());
        a1.Deposit(100);
        System.out.println("DEPOSIT 100");
        System.out.println(a1.Accountinfo() + " (AFTER DEPOSIT)");
        a1.Withdraw(100);
        System.out.println("************************************");
        System.out.println();

        var customerinfo2 = b1.Getcostumer(1);
        System.out.println(b1.Getcostumer(1));
        System.out.println("BEFORE DEPOSIT: " + a1.getBalance());
        a1.Deposit(1000);
        System.out.println("DEPOSIT 1000");
        System.out.println("AFTER DEPOSIT: " + a1.getBalance());
        a1.Withdraw(500);
        System.out.println("Withdraw 500");
        System.out.println(a1.Accountinfo() + " (AFTER DEPOSIT + WITHDRAW)");
        a1.Withdraw(500);
        System.out.println("************************************");
        System.out.println();

        var customerinfo3 = b1.Getcostumer(2);
        System.out.println(b1.Getcostumer(2));
        a1.Deposit(350);
        System.out.println("BEFORE WITHDRAW: " + a1.getBalance());
        a1.Withdraw(100);
        System.out.println("WITHDRAW 100");
        System.out.println(a1.Accountinfo() + " (AFTER WITHDRAW)");
        a1.Withdraw(250);
        System.out.println("************************************");
        System.out.println();

        var customerinfo4 = b1.Getcostumer(3);
        System.out.println(b1.Getcostumer(3));
        System.out.println("BEFORE DEPOSIT: " + a1.getBalance());
        a1.Deposit(650);
        System.out.println("DEPOSIT 650");
        System.out.println(a1.Accountinfo() + " (AFTER DEPOSIT)");
        a1.Withdraw(650);
        System.out.println("************************************");
        System.out.println();

    }
}
