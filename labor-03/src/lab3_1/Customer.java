package lab3_1;

public class Customer {
    private String firstName;
    private String lastName;

    private BankAccount account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public BankAccount getAccount() {
        return account;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + " " + getAccount();
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public void closeAccount(){
        this.account = null;
    }

}
