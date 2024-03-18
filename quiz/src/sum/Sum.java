//7번 문제 - 수열의 합
//동렬이는 수학 문제를 풀다 다음과 같은 수열을 보았다.
//Sn=(1)+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+...+n)
//임의의 정수 n이 주어질 때 이 수열의 합 Sn을 구하는 프로그램을 작성하시오.
//입력
//n이 입력된다. (n<=50)
//출력
//수열의 합 Sn의 값을 출력한다.
//입력 예시
//5
//출력 예시
//35

package sum;

import java.util.Scanner;

public class Sum {
    public static int calSum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += calSum(i);
        }
        System.out.println(result);
    }
}
