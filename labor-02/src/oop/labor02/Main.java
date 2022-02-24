package oop.labor02;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Balance $" + account.getBalance());
        account.deposit(500);
        System.out.println("Balance $" + account.getBalance());
        account.withdraw(2000);
        System.out.println("Balance $" + account.getBalance());
        account.withdraw(2000);
        System.out.println("Balance $" + account.getBalance());
    }
}
