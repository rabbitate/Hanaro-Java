//8번 문제 - 자리 배치
//A중학교에 첫 발령을 받은 B교사는 1학년 1반 담임을 맡게 되었다.
//기대를 안고 첫 출근한 B교사는 너무 설렌 나머지 학생들이 등교하기도 전에 교실에 가서 학생들이 오기 만을 기다리고 있었다.
//그리고 제일 먼저 무슨 일을 해야 될지 생각하던 중 학생들 자리 배치를 우선적으로 해야겠다고 생각했다.
//여러 가지 자리 배치 방법을 고려하다가 학생들의 키가 작은 순서대로 앞에서부터 앉히는 것이 제일 좋은 방법이라고 결정하게 되었다.(키 큰 학생은 무슨 죄입니까?)
//예를 들어, 160, 165, 164, 165, 150, 165, 168, 145, 170의 학생들 키가 주어지고 한 줄에 6명씩 앉는다면 다음과 같이 앉으면 될 것이다.
//   145 150 160 164 165 165     165 168 170      왼쪽 위부터 차례대로 키 순서대로 앉으며 한 줄이 다 찼을 경우 다음 줄로 넘어간다. 다음 줄도 마찬가지로 왼쪽부터 채운다.
//이와 같이 학생의 키 순서대로 자리를 배치하는 프로그램을 작성하시오.
//        입력
//첫 번째 줄에 학생 수(N)와 한줄에 앉을 수 있는 자리수(C)가 자연수로 주어진다. 단, (1≤N≤99), (1≤C≤10)
//둘째 줄에는 N명의 학생 키들이 차례로 구분되어 입력된다.
//출력
//학생들의 자리 배치 결과를 공백으로 분리하여 출력한다.
//        입력 예시
//9 6 160 165 164 165 150 165 168 145 170(split함수로 분리하여 데이타를 사용하시오.)
//출력 예시
//145 150 160 164 165 165
//165 168 170

package seat;

import java.util.Arrays;
import java.util.Scanner;

public class Seat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N; // 학생 수
        int C; // 한 줄에 앉을 수 있는 자리 수
        String[] stuHeight; // 학생들 키 배열

        while (true) {
            System.out.print("학생 수와 한 줄에 앉을 수 있는 자리 수를 입력하세요: ");
            N = scanner.nextInt();
            C = scanner.nextInt();

            if(!(1 <= N && N <= 99)) {
                System.out.println("학생 수는 1명에서 99명입니다");
                continue;
            }

            if(!(1 <= C && C <= 10)) {
                System.out.println("한 줄에 앉을 수 있는 자리 수는 1개 이상 10개 이하입니다");
                continue;
            }
            break;
        }
        scanner.nextLine();
        stuHeight = scanner.nextLine().split(", ");

        Arrays.sort(stuHeight);

        for (int i = 0; i < N; i++) {
            if (i % C == 0) {
                System.out.println("");
            }
            System.out.print(stuHeight[i] + " ");
        }
    }
}
