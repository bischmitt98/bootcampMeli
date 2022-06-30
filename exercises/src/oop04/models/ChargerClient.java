package oop04.models;

import oop04.interfaces.CheckBalance;
import oop04.interfaces.WithdrawCash;

public class ChargerClient extends Client implements WithdrawCash, CheckBalance {
    public ChargerClient(long id, String name, int numAccount) {
        super(id, name, numAccount);
    }

    @Override
    public void checkBalance() {
        System.out.println("Checking balance... ");
    }

    @Override
    public void withdrawCash() {
        System.out.println("Taking some cash... ");
    }
}
