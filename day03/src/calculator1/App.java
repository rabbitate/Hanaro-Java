package calculator1;

public class App {
    public static void main(String[] args) {
        Calculator cal = new Calculator(10,20);

        System.out.println(cal.sum());
        System.out.println(cal.div());
    }
}
