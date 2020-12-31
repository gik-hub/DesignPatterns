package com.actitover.encapsulation;

public class Account {

    private float balance;

    public void deposit(int amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > 0 && balance > amount)
            balance -= amount;
    }

    public float getBalance() {
        return balance;
    }
}
