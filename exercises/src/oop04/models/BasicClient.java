package oop04.models;

import oop04.interfaces.CheckBalance;
import oop04.interfaces.PayServices;
import oop04.interfaces.WithdrawCash;

public class BasicClient extends Client implements CheckBalance, PayServices, WithdrawCash {
    Client client;
    public BasicClient(long id, String name, int numAccount) {
        super(id, name, numAccount);
    }

    @Override
    public void checkBalance() {
        System.out.println("Checking balance...");
    }

    @Override
    public void payServices() {
        System.out.println("Paying services... ");
    }

    @Override
    public void withdrawCash() {
        System.out.println("Taking some cash... ");
    }
}
