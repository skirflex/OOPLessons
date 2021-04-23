package Company;

import java.util.*;

public  class Company {

   private static String nameOfCompany = "ООО Восток";

  Map <String , Integer > salaries = new TreeMap<>();
   ArrayList<String> Employee = new ArrayList<>();
   Manager manager = new Manager();
   TopManager topManager = new TopManager();
   Operator operator = new Operator();




   public void getEmployee() {

      for (int i = 0; i <= 200; i++) {

         String[] array = {"Manager", "TopManager", "Operator"};
         //Employee.add(i, array[(int) (Math.random() * 2)]);
         Employee.add(i , array[1]);

      }

      for (int i = 0 ; i < Employee.size() ; i++) {

         System.out.println(i + ") " + Employee.get(i));
      }
   }


   public void setIncome(int income) {
      this.income = income;
   }

   public static int income;



   public void hire(int index) {

      String string = Employee.get(index);
      if (string.equals("Manager"))
      {
         int salary  = manager.getMonthSalary();
         salaries.put(string,salary);

      }
      else if (string.equals("Operator"))
      {
         System.out.println("ТУТ");
         int salary = operator.getMonthSalary();
         salaries.put(string,salary);
      }
      else if (string.equals("TopManager"))
      {
         System.out.println("!");
         int salary = topManager.getMonthSalary();
         salaries.put(string,salary);
         
      }
   }

   public  int getIncome() {


      for ( Integer value : salaries.values() ) {
         income += value;
      }
      return income;
   }





}


