package oop04;

import oop04.models.ChargerClient;
import oop04.models.BasicClient;
import oop04.models.ExecutiveClient;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        ChargerClient cc = new ChargerClient(1L, "Bi", 123);
        System.out.println(cc);
        cc.checkBalance();
        cc.withdrawCash();
        cc.transactionOk();

        System.out.println("-------------------------------------");
        BasicClient bc = new BasicClient(2L, "Dudu", 124);
        System.out.println(bc);
        bc.payServices();
        bc.transactionNotOk();
        bc.checkBalance();
        bc.withdrawCash();
        bc.transactionOk();

        System.out.println("-------------------------------------");
        ExecutiveClient ec = new ExecutiveClient(3L, "Maria", 125);
        System.out.println(ec);
        ec.deposit();
        ec.transfer();
        ec.transactionOk();
    }
}
