package oop.lab4_2;

import java.util.ArrayList;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(double sum) {
        balance = sum;
    }

    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount(String accountNumber, String balance){
        this.accountNumber = accountNumber;
        this.balance = Double.parseDouble(balance);
    }

    public void deposit(double sum){
        balance+=sum;
    }

    public boolean withdraw(double sum){
        if(sum<=balance){
            this.balance-=sum;
            return true;
        }
        return false;
    }

    public double getBalance(){
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String toString(){
        return "\nAccount number: " + accountNumber + "\nBalance: " + balance + "\n";
    }

}
