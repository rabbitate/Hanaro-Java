package app;

import company.Employee;

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee(0, "10001", "james", 200000L);
        Employee emp2 = new Employee(0, "10001", "intern", 200000L);
        System.out.println(emp.toString());
        System.out.println(emp2.toString());
    }
}
