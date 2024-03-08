package variable;

public class Variable2 {
    public static void main(String[] args) {
        // 정수, 기본: int
        int a = 10;
//        byte a1 = a; // 1 바이트에 4바이트로 초기화 -> 오류
        byte a1 = 10;
        byte a2 = 10;
        byte a3 = (byte) (a1 + a2); // 연산 결과가 32비트기 때문에 초기화할 수 없다 -> 형변환 필요
        System.out.println(a3);

        int a4 = 215000000;
//        long a5 = 2150000000; // 숫자는 무조건 int라 오류 발생한다
        long a5 = 2150000000l; // 숫자는 무조건 int라 오류 발생한다 -> l 또는 L 붙여야 한다
        long a6 = 1150000000 + 1150000000;
        // 정수형 리터럴은 기본적으로 int 타입으로 해석되기 때문에 연산 결과는 int 타입의 범위를 벗어나 제대로 출력되지 않는다
        System.out.println(a6); // -1994967296

        char ch = 'A'; // character
        System.out.println((int)ch); // 65

        char ch2 = '\u0042'; // unicode
        System.out.println(ch2); // B

        char ch3 = 0xac00; // unicode 44032
        System.out.println(ch3); // B

        // 실수, 기본: double
        double d = 10f;
        float f = 10.0F; // double이 표준이므로 64비트를 32비트로 초기화 할 수 없으므로 f 또는 F를 붙여야 한다

        float f2 = (float) 10.1 + 10; // 1. 정수가 더 작으므로 실수로 변환 2. 실수 기본이 double이므로 오류 발생 -> (float) 형변환 필요

        // Boolean
        boolean b = true;
    }
}
