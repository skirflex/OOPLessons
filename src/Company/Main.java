package Company;

public class Main {
    public static void main(String[] args) {


        Company company = new Company();
        company.getEmployee();

       // company.setIncome(1234444);
        System.out.println(company.getIncome());
        company.hire(3);
        company.hire(4);
        System.out.println(company.getIncome());

    }
}
