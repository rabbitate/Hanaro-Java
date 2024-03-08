package OOP.company;

public class Employee {
    private int id;
    private String idc;
    private String name;
    private long salary;

    public Employee() {

    }

    public Employee(int id, String idc, String name, long salary) {
        this.id = id;
        this.idc = idc;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", idc='" + idc + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getIdc() {
        return idc;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    // Method
    public long getAnnualSalary() {
        return 12 * salary;
    }
}
