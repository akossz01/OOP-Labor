package oop.labor06;

public class BankAccount {
    public String PREFIX;
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int numAccounts = 0;
    private String accountNumber;
    private double balance;

    public BankAccount(){
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }

    public BankAccount(double sum) {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
        balance = sum;
    }

    public BankAccount(String accountNumber){
        ++numAccounts;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount(String accountNumber, String balance){
        ++numAccounts;
        this.accountNumber = accountNumber;
        this.balance = Double.parseDouble(balance);
    }

    private static String createAccountNumber(){
        int length = 7 - String.valueOf(numAccounts).length(); //vagy String.format
        String zeroes="";
        for(int i=0; i<length; ++i){
            zeroes = zeroes + "0";
        }
        return "OTP" + zeroes + numAccounts;
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public String toString(){
        return "\nAccount number: " + accountNumber + "\nBalance: " + balance + "\n";
    }

}
