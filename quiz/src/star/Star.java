//6번 문제 - 별찍기
//어떤 수 n을 입력받으면 다음과 같은 삼각형을 출력한다.
//여기서 입력되는 n은 반드시 홀수이다.
//        입력
//3부터 99 까지의 홀수 중 하나가 입력된다.
//        출력
//출력예시와 같은 삼각형을 출력한다.
//입력 예시
//5
//출력 예시(정피라미드 형입니다. 폰트때문에 살짝 기울어져 보일 뿐입니다)
//        *
//        ***
//        *****
//입력 예시
//7
//출력 예시(정피라미드 형입니다. 폰트때문에 살짝 기울어져 보일 뿐입니다)
//        *
//        ***
//        *****
//        *******

package star;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("삼각형 숫자를 입력하세요: ");
            n = scanner.nextInt();
            if (n % 2 == 1 && (n >= 3 && n <= 99)) {
                break;
            } else {
                System.out.println("3부터 99 까지의 홀수를 입력하세요");
            }
        }

        for (int i = 1; i <= n; i += 2) {
            for (int j = 0; j < (n/2) - (i/2); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
