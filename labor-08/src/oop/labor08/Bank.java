package oop.labor08;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

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

    public ArrayList<Customer> getCustomers(){
        ArrayList<Customer> customers = new ArrayList<>();
        for(Customer c: customers){
            customers.add(c);
        }
        return customers;
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
