package oop.labor08;

public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank("OTP");
        Customer c1 = new Customer("Akos", "Szabo");
        Customer c2 = new Customer("Zsolt", "Papai");

        b1.addCustomer(c1); //hozza adja b1 bankhoz a 2 klienst
        b1.addCustomer(c2);

        SavingsAccount s1 = new SavingsAccount(2);
        CheckingAccount ch1 = new CheckingAccount(10000);
        SavingsAccount s2 = new SavingsAccount(1.5);
        CheckingAccount ch2 = new CheckingAccount(2000);

        c1.addAccount(s1); //hozza adja a 2 klienshez a 2 szamlat
        c1.addAccount(ch1);
        c2.addAccount(s2);
        c2.addAccount(ch2);

        s1.deposit(500);
        ch1.deposit(45);
        s2.deposit(1200);
        ch2.deposit(9200);

        System.out.println(c1);
        System.out.println(c2);

        s1.addInterest();
        s2.addInterest();

        System.out.println(c1);
        System.out.println(c2);

        s1.withdraw(100);
        ch1.withdraw(250);
        s2.withdraw(200);
        ch2.withdraw(18000);

        System.out.println(c1);
        System.out.println(c2);
    }
}
