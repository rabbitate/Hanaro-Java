package company;

public class Employee {
    private int id;
    private String idc;
    private String name;
    private long salary;

    private static int num = 100; // static 키워드가 붙으면 객체 생성 없이 할당된다

    public Employee() {
        System.out.println("Default Contructor...");
    }

    public Employee(int id, String idc, String name) {
        this.id = id;
        this.idc = idc;
        this.name = name;
        this.salary = 100000; // default value
    }

//    public Employee(int id) {
//        this(id, "", "", 10000L); // this() 호출은 Constructor 첫 번째 줄에 위치해야 한다
//    }

    public Employee(int id, String idc, String name, long salary) {
        this.id = num++;
        this.idc = idc;
        this.name = name;
        if(salary <= 0) {
            // 예외를 발생시킨다
        }
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
