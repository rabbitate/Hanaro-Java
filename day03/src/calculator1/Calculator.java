package calculator1;

public class Calculator {
    private int num1;
    private int num2;

    public Calculator() {
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sum() {
        return num1 + num2;
    }

    public double div() {
        return num1 * 1.0 / num2;
    }
}
