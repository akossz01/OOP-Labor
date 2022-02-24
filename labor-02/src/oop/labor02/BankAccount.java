package oop.labor02;

public class BankAccount {
    private double balance;

    public BankAccount(double sum) {
        balance = sum;
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
}
