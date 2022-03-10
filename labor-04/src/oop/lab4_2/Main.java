package oop.lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(readFromFile("lab4_2_input.txt"));
    }

    public static ArrayList<Customer> readFromFile(String fileName) {
        ArrayList<Customer> customers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String type = items[0].trim();
                String firstName = items[1].trim();
                String lastName = items[2].trim();
                String accountNumber = items[1].trim();
                String balance = items[2].trim();
                if(type.equals("Customer")) {
                    customers.add(new Customer(firstName, lastName));
                }
                if(type.equals("Account")){
                    Customer customer = customers.get(customers.size()-1);
                    customer.addAccount(new BankAccount(accountNumber, balance));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return customers;
    }
}
