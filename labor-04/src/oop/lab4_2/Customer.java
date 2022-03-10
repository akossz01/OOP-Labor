package oop.lab4_2;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName +"'s accounts:\n" +
                "\t" + accounts +
                "\n";
    }
}
