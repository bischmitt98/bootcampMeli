package models;

public class OverDraft extends Account{
    private double limit;

    public OverDraft(int num, double limit) {
        super(num);
        this.limit = limit;
    }

    @Override
    public void withdraw(double value) {
        super.withdraw(value);
        if(value <= getBalance() + limit){
            super.withdraw(value);
        }
    }
}
