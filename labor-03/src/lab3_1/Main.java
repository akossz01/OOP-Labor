package lab3_1;

import lab3_1.BankAccount;
import lab3_1.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Akos", "Szabo");
        System.out.println(customer1);
        customer1.setAccount(new BankAccount("OTP00001"));
        System.out.println(customer1);
        customer1.getAccount().deposit(1000);
        System.out.println(customer1);
        customer1.getAccount().withdraw(500);
        System.out.println(customer1);

        Customer customer2 = new Customer("Mary", "White");
        customer2.setAccount(new BankAccount("OTP00002"));
        System.out.println(customer2);
        customer2.getAccount().deposit(10500);
        System.out.println(customer2);
        customer2.closeAccount();
        System.out.println(customer2);


    }
}
