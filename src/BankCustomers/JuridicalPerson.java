package BankCustomers;

public class JuridicalPerson extends Clients {

    @Override
    public double depositeMoney(double deposite) {
        balance += deposite;
        return balance;
    }

    @Override
    public void infoDeposite() {
        System.out.println("Комиссии на пополнение нет");
    }

    @Override
    public double takeOffTheMoney(double withdraw) {
        balance -= (withdraw + withdraw * 0.01);
        return balance;
    }

    @Override
    public void Infowithdraw() {
        System.out.println("Вывод денег с комиссией 1%");
    }
}
