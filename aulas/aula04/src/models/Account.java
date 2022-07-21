package models;

import interfaces.DataBase;

public abstract class Account {
    private int num;
    private double balance;

    public Account(int num){
        this.num = num;
    }

    public void deposit (double value){
        balance += value;
    }

    public void withdraw(double value){
        balance -= value;
    }

    public void save(DataBase bank){
        bank.save(this);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
