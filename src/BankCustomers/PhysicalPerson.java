package BankCustomers;

public class PhysicalPerson  extends Clients{


    @Override
    public double depositeMoney(double deposite) {

        balance += deposite;
        return balance;
    }

    @Override
    public void infoDeposite() {
        System.out.println("Комиссии на пополнение нет ");
    }

    @Override
    public double takeOffTheMoney(double withdraw) {
        balance -= withdraw;
        return balance;
    }

    @Override
    public void Infowithdraw() {
        System.out.println("Вывод денег без комисии");
    }
}
