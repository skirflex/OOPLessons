package BankCustomers;

public class IndividualEntrepreneur extends Clients {

    @Override
    public double depositeMoney(double deposite) {

        balance += deposite;
        if (deposite < 1000) {
            System.out.println("Ко внесенению " + (deposite + deposite * 0.01));
        }
        else
        {
            System.out.println("Ко внесенению " + (deposite + deposite * 0.005));
        }
        return balance;
    }

    @Override
    public void infoDeposite() {
        System.out.println("Комиссия на пополнение < 1000 - 1%\n" +
                "Комиссия на пополнение => 1000 - 0.5%");
    }

    @Override
    public double getBalance() {
        return super.getBalance();
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
