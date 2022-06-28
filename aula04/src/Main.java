import models.Account;
import models.CheckingAccount;
import models.OverDraft;
import utils.MySQL;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        OverDraft od1 = new OverDraft(111, 1500);
        OverDraft od2 = new OverDraft(112, 1200);
        CheckingAccount ca1 = new CheckingAccount(123);
//      MySQL mySQL = new MySQL();
//      od1.save(mySQL);


//      ArrayList<OverDraft> overDrafts = new ArrayList();
        ArrayList<Account> accounts = new ArrayList();
        accounts.add(od1);
        accounts.add(od2);
        accounts.add(ca1);



//        for (int i = 0; i < accounts.size(); i++){
//            System.out.println("Account: " + accounts.get(i).getNum());
//        }

        for(Account a : accounts){ // forEach
            System.out.println("Account: " + a.getNum());
        }

        HashMap<Integer, Account> accountMap = new HashMap<>();
        accountMap.put(od1.getNum(), od1);
        accountMap.put(ca1.getNum(), ca1);

        Account foundAccount = accountMap.get(111);
        System.out.println("The account found was: " + foundAccount.getNum());
    }
}
