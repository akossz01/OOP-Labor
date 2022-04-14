package oop.labor08;

public class BankAccount {
    public String PREFIX;
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int numAccounts = 0;
    protected final String accountNumber;
    protected double balance;

    protected BankAccount(){
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }

    protected BankAccount(double sum) {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
        balance = sum;
    }

    protected BankAccount(String accountNumber){
        ++numAccounts;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    protected BankAccount(String accountNumber, String balance){
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public String toString(){
        return "\nAccount number: " + accountNumber + "\nBalance: " + balance + "\n";
    }

}