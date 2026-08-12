package oop1.ex;

public class Account {
    int balance = 0;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println("Withdraw Successful");
            balance -= amount;
        } else {
            System.out.println("Withdraw Failed");
        }
    }
}
