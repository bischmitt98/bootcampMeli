package oop04.models;

import oop04.interfaces.Deposit;
import oop04.interfaces.Transfer;
import oop04.interfaces.WithdrawCash;

public class ExecutiveClient extends Client implements Deposit, Transfer{

    public ExecutiveClient(long id, String name, int numAccount) {
        super(id, name, numAccount);
    }

    @Override
    public void deposit() {
        System.out.println("Deposit... ");
    }

    @Override
    public void transfer() {
        System.out.println("Transfer... ");
    }


}
