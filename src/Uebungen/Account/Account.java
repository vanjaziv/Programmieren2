package Uebungen.Account;

public class Account {
    private String owner;
    private String iban;
    private String bic;
    private double balance;

    // A constructor shall take the values for owner, iban and bic
    // and set the account balance (balance) the value 0.0.

    public Account(String owner, String iban, String bic) {
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        balance = 0.0;
    }

    // A method add(double value) increments the account balance by
    //the given value.

    public void add(double value){

        if (value > 0){
            balance += value;
        }
    }

    //A method deposit(double value) decreases the account balance by the passed value.
    //However, make sure here that the value can never go below 0.
    //can happen.

    public double deposit (double value){
        if(value > 0){
            if (value < balance) {
                balance -= value;
            } else {
                value = balance;
                balance = 0;
            }
            return value;
        }
        return 0;
    }

    // Another method getBalance() returns the current account balance.

    public double getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", balance=" + balance +
                '}';
    }
}
