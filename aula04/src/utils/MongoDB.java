package utils;

import interfaces.DataBase;
import models.Account;

public class MongoDB implements DataBase {
    @Override
    public void save(Account account) {
        System.out.println("Saving in MongoDB the account: " + account.getNum());
    }
}
