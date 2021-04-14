package BankAccount;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MainAccount myAccount = new MainAccount();
        DepositSettlementAccount depositAccount = new DepositSettlementAccount();
        System.out.println("Здравствуйте, " + myAccount.nameOfTheHolder + "!");
        while (true){
            System.out.println("Выберите номер действия\n" +
                    "1. Снять со счёта\n" +
                    "2. Внести на счёт\n" +
                    "3. Вывод баланса\n" +
                    "4. Перевести на другую банковскую карту счёт\n" +
                    "5. Перевод средств на депозитный счёт\n" +
                    "6. Баланс депозитного счёта\n" +
                    "7. Снять деньги с депозитного счёта\n" +
                    "0. Выход\n" +
                    "==================");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            String index = text.replaceAll("[^0-9]", "");
            switch (index) {
                case "1" :
                    System.out.println("Сколько денег вы хотите снять?");
                    int withdrawal = scanner.nextInt();
                    myAccount.TakeOffMoney(withdrawal);
                    break;

                case "2" :
                    System.out.println("Сколько денег вы хотите внести?");
                    int deposite = scanner.nextInt();
                    myAccount.DepositeMoney(deposite);
                    break;

                case "3" :
                    System.out.println("Ваш баланс " + myAccount.GetBalance() + " руб.");
                    System.out.println("\n");
                    break;
                case "4" :
                    System.out.println("Введите сумму перевода");
                    double transfer = scanner.nextDouble();
                    System.out.println("Введите номер счёта для перевода");
                    Scanner scanner1 = new Scanner(System.in);
                    String account = scanner1.nextLine();
                    myAccount.send(account, transfer);
                    break;
                case "5" :
                    System.out.println("Введите сумму перевода на депозитный счёт");
                    Scanner scanner2 = new Scanner(System.in);
                    double depositeSumm = scanner2.nextDouble();
                    if (myAccount.depositSend(depositeSumm)) {
                        depositAccount.depositbalance += depositeSumm;
                        System.out.println("Успешно");
                        System.out.println(depositAccount.calendar.get(Calendar.MONTH));

                        if (depositAccount.calendar.get(Calendar.MONTH) <= depositAccount.today.get(Calendar.MONTH)) {

                            depositAccount.calendar.roll(Calendar.MONTH, 1);
                            depositAccount.calendar.set(Calendar.DAY_OF_MONTH, 1);
                            depositAccount.calendar.set(Calendar.MINUTE,0);
                            depositAccount.calendar.set(Calendar.HOUR_OF_DAY,0);
                            depositAccount.calendar.set(Calendar.SECOND,0);
                        }
                        System.out.println(depositAccount.calendar.get(Calendar.MONTH));
                    }
                    break;

                case "6":
                    System.out.println(depositAccount.GetDepositBalance());
                    break;

                case "7":
                    if (depositAccount.blockTakeoff()) {
                        System.out.println("Сколько денег вы хотите снять?");
                        int withdrawal1 = scanner.nextInt();
                        depositAccount.takeOffTheMoney(withdrawal1);
                        myAccount.balance += withdrawal1;
                    }
                    break;
                case "8":
                    System.out.println(depositAccount.calendar.getTime());
                    System.out.println(depositAccount.today.getTime());

                case "0" :
                    return;

                default:
                    System.out.println("Проверьте правильность введной команды");
            }

        }





    }
}
