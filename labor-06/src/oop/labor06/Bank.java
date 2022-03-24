package oop.labor06;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name){
        this.name = name;
    }

    public Customer getCustomer(int id){
        for(Customer c: customers){
            if(c.getId() == id)
                return c;
        }
        return null;
    }

    public void addCustomer(Customer newCustomer){
        customers.add(newCustomer);
    }

    private void printCustomers(PrintStream out){
        for(Customer c:customers){
            out.println(c);
        }
    }

    public void printCustomersToStdout(){
        printCustomers(System.out);
    }

    public void printCustomersToFile(String filename){
        try(PrintStream out = new PrintStream(filename)){
            printCustomers(out);
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
