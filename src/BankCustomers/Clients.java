package BankCustomers;

public abstract class Clients {

    protected double balance;

    public double getBalance() {
        return balance;
    }

    public abstract double depositeMoney (double deposite);

    public abstract void infoDeposite ();

    public abstract double takeOffTheMoney (double withdraw);

    public abstract void Infowithdraw ();






}
