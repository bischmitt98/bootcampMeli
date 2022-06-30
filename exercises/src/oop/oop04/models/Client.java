package oop.oop04.models;


public abstract class Client {
    private long Id;
    private String name;
    private int numAccount;

    public Client(long id, String name, int numAccount) {
        Id = id;
        this.name = name;
        this.numAccount = numAccount;
    }

    public void transactionOk() {
        System.out.println("Transaction ok!");
    }

    public void transactionNotOk() {
        System.out.println("Fail!");
    }

    @Override
    public String toString() {
        return "Client: " +
                "Id= " + Id +
                ", name= " + name +
                ", numAccount= " + numAccount;
    }
}
