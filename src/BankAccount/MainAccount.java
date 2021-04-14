package BankAccount;

public class MainAccount {

    public String nameOfTheHolder = "Аникин Сергей Николаевич";
    public String accountNumber = "5422322232114323";
    public double balance;
    public String exceptionEnoughtMoney = "Недостаточно денег на счете";



    public void TakeOffMoney(int withdrawal)
    {
        if (balance < withdrawal)
        {
            System.out.println(exceptionEnoughtMoney);
            return;
        }
        else
            balance -= withdrawal;
        System.out.println("Успешно");
        return;
    }

    public double GetBalance()
    {
        return this.balance;
    }

    public void DepositeMoney(int deposite)
    {
        balance += deposite;
        System.out.println("Успешно");
        return;
    }

    public void send(String account, double amount)
    {
        if (balance >= amount + (amount * 0.01)) {
            balance -= amount + (amount * 0.01);
            System.out.println("Перевод успешно выполнен с комиссией: " + amount * 0.01 + "р");
            return;
        }
        else {
            System.out.println(exceptionEnoughtMoney);
            System.out.println();
            return;
        }

    }
    public boolean depositSend (double deposite)
    {
        if (balance >= deposite)
        {
            balance -= deposite;
            return true;
        }
        else
        {
            System.out.println(exceptionEnoughtMoney);
            System.out.println();
            return false;
        }
    }
}
