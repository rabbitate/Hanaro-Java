package OOP.app;

import OOP.company.Employee;

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee(100,"id01","james",200000);
//        emp.salary = 2000000000;
        long sal = emp.getSalary();
        long annSal = emp.getAnnualSalary();
        System.out.println(sal);
        System.out.println(annSal);
    }
}
