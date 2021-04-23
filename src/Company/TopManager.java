package Company;

public class TopManager implements Employee{




    @Override
    public int getMonthSalary() {



        double salary =2;
        if (getCompanyIncome() > 1000000)
        {
            salary =  (Math.random()* 30000 + 20000)  * 1.5;
        }
        else
        {
            salary = (Math.random()* 30000 + 20000);
        }
       return (int) salary;
    }

    public static int getCompanyIncome ()
    {
        Company company = new Company();
        return company.getIncome();
    }


}
