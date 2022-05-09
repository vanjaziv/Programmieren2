package Uebungen.Account;

import Uebungen.Account.Account;

// Create a new class "Bank", which contains the static method main() for testing purposes.
//Create three objects from the Account class and post certain values
//up and down.
//Manage the three accounts in an array.
//Loop through the array and output the account balance for each.
public class Bank {

    public static void main(String[] args) {
        Account a1 = new Account("Lala","At...", "BAWA..." );
        Account a2 = new Account("Lalaa","At...", "BAWA..." );
        Account a3 = new Account("Lalaaa","At...", "BAWA..." );

        a1.add(1000);
        a2.add(800);
        a3.add(400);

        Account []accounts = {a1, a2, a3};



        System.out.println(a3.deposit(300));
        for (int i = 0;  i < accounts.length; ++i) {
            System.out.println(accounts[i]);
        }
    }
}
