package BankAccount;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DepositSettlementAccount extends MainAccount  {


    double depositbalance;
    DateFormat dateFormat = new SimpleDateFormat("MM.yyyy");
    Calendar calendar = Calendar.getInstance();
    Calendar today = Calendar.getInstance();

    public double GetDepositBalance() {
        return depositbalance;
    }

    public boolean blockTakeoff ()
    {
        if (calendar.get(Calendar.MONTH) <= today.get(Calendar.MONTH) && calendar.get(Calendar.HOUR) <= today.get(Calendar.HOUR))
        {
            return true;
        }
        else
            System.out.println("Вывод средств заблокирован до " + calendar.getTime());
            return false;
    }
    public void takeOffTheMoney (int withdrawal)
    {
        if (withdrawal > balance)
        {
            System.out.println(this.exceptionEnoughtMoney);
            return;
        }
        else
            balance -= withdrawal;
        System.out.println("Успешно");
        return;
    }

}
