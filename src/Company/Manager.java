package Company;

public  class Manager implements Employee{

    @Override
    public int getMonthSalary() {
        int salary = (int) ((Math.random()* 30000 + 1000) + (0.05 * (Math.random()* 25000 + 115000)));
        return salary;
    }

    
}
