package operator;

public class Operator1 {
    public static void main(String[] args) {
        long a = 10;
        long b = 10;
        int c = (int) (a / b); //  a와 b가 long 타입으로 선언되어 있기 때문에 a / b의 연산 결과는 long 타입 -> int 형변환 필요

        int i1 = 10;
        int i2 = 3;
        double i3 = i1 / i2; // int를 double에 넣기 때문에 3.0
        double i4 = i1 * 1.0 / i2;
        System.out.println(i3); // 3.0
        System.out.println(i4); // 3.3333333333333335

        int a1 = 0;
        if(3 > 5) {
            a1 = 6;
        } else {
            a1 = 9;
        }

        int bb = (3 > 5) ? 6 : 9;

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int num4 = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        System.out.println(num4);
    }
}
