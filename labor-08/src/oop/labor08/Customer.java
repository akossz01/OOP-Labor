package oop.labor08;

import java.util.ArrayList;

public class Customer {
    private int numCustomers;
    private int Id;
    private final String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return Id;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    /*public ArrayList<String> getAccountNumbers(){

    }*/

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void closeAccount(BankAccount account){
        account = null;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName +"'s accounts:\n" +
                "\t" + accounts +
                "\n";
    }
}
