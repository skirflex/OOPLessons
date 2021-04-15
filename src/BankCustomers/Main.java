package BankCustomers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            PhysicalPerson physicalPerson = new PhysicalPerson();
            JuridicalPerson juridicalPerson = new JuridicalPerson();
            IndividualEntrepreneur individualEntrepreneur = new IndividualEntrepreneur();


                    physicalPerson.depositeMoney(1000);
                    individualEntrepreneur.depositeMoney(1000);
                    juridicalPerson.depositeMoney(1000);

                    physicalPerson.takeOffTheMoney(500);
                    individualEntrepreneur.takeOffTheMoney(400);
                    juridicalPerson.takeOffTheMoney(300);

                    physicalPerson.infoDeposite();
                    individualEntrepreneur.infoDeposite();
                    juridicalPerson.infoDeposite();

                    physicalPerson.Infowithdraw();
                    individualEntrepreneur.Infowithdraw();
                    juridicalPerson.Infowithdraw();

        System.out.println(physicalPerson.getBalance());
        System.out.println(individualEntrepreneur.getBalance());
        System.out.println( juridicalPerson.getBalance());





    }
}
