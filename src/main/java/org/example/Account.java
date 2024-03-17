package org.example;

public class Account {
    private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " hase been added to the account.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public double withdraw(double amount) {
        if(amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " has been withdrawn from the account.");
            return amount;
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
            return 0.0;
        }
    }

    public double getBalance(){
        return balance;
    }
}
