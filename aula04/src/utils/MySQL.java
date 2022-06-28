package utils;

import interfaces.DataBase;
import models.Account;

public class MySQL implements DataBase {

    @Override
    public void save(Account account) {
        System.out.println("Saving in MySQL the account: " + account.getNum());
    }
}
