package models;

public class CheckingAccount extends Account {

    public CheckingAccount(int num) {
        super(num);
    }

    @Override
    public void withdraw(double value) {
        if(value <= getBalance()){
            super.withdraw(value);
        }
    }
}
