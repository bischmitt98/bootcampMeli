package oop.oop04.models;

import oop.oop04.interfaces.Deposit;
import oop.oop04.interfaces.Transfer;

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
