package oop.company;

// 기본적으로 Object를 extends 하고 있다
public class Employee {
    private String id;
    private String name;
    private String dept;
    private long salary;

    public Employee() {
    }

    public Employee(String id, String name, String dept, long salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public long getSalary() {
        return salary;
    }

    public long getAnnSalary() {
        return (long)((this.salary * 12) - (this.salary * 12 * 0.1));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
