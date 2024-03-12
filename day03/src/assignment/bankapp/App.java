package assignment.bankapp;

import assignment.bank.Account;
import assignment.bank.BankAccount;
import assignment.bank.SavingsAccount;

public class App {
    public static void main(String[] args) {
        Account[] accArray = new Account[3];

        accArray[0] = new Account("100", "James", 3.4, 10000);
        accArray[1] = new BankAccount("101", "James", 3.4, 10000);
        accArray[2] = new SavingsAccount("102", "James", 3.4, 10000,"210421", "230121", 100000);

        for(Account acc: accArray) {
            System.out.println(acc);
        }

        BankAccount ac = new BankAccount("103", "James", 3.4, 10);
        System.out.println(ac);
        ac.transMoney(1000);
        System.out.println(ac);
        ac.deposit(20000);
        System.out.println(ac);
    }
}
