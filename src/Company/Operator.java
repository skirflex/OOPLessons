package Company;

public class Operator implements Employee {
    @Override
    public int getMonthSalary() {

        int salary = (int) (Math.random()* 30000 + 4000);
        return salary;
    }
}
