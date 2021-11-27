package com.company;

import java.util.ArrayList;
import java.util.List;


//State
public class Bank {
    private String BankName;
    private List<Costumer> Customers;


    //Constructor


    public Bank(String bankName, List<Costumer> customers) {
        BankName = bankName;
        Customers = customers;
    }

    public Bank(String bankName) {
        BankName = bankName;
        Customers = new ArrayList<>();
    }

    //Behaviour
    public String getBankName() {
        return BankName;
    }


    public void AddAccount(long pnr) {
        var customerexists = getCustomerIndex(pnr);
            if (customerexists != -1) {
                var customer = Customers.get(customerexists);
                customer.AddAccount(new Account());
            }
        }

    public List<String> Getcostumer(long pnr) {
        List<String> temp = new ArrayList<>();
        var customerExists = pnr;
        if (customerExists != -1) {
            var customer = Customers.get((int) customerExists);
            temp.add("Customer info: " + Customers.get((int) customerExists));
        } else {
            temp.add("User not found");
        }
        return temp;
    }

    private int getCustomerIndex(long pnr) {
        int custIndex = -1;
        for (var customer : Customers) {
            if (customer.getPersonnummer() == pnr) {
                custIndex = Customers.indexOf(customer);
            }
        }
        return custIndex;
    }

    public void addCustomer(Costumer c) {
        Customers.add(c);
    }
    }
