//3번 문제 - 369 게임 달인
//3 6 9 게임을 하던 현빈이는 3 6 9 게임에서 잦은 실수로 계속해서 벌칙을 받게 되었다.
//3 6 9 게임의 왕이 되기 위한 마스터 프로그램을 작성해 보자.
//입력
//Scanner 콘솔입력으로 1부터 10사이의 정수 한 개가 입력된다.
//        출력
//1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데,
//3 또는 6 또는 9가 들어간 경우 그 수 대신 영문 대문자 X를 출력한다.
//입력 예시
//5
//출력 예시
//1 2 X 4 5
//입력 예시
//9
//출력 예시
//1 2 X 4 5 X 7 8 X
//3 6 9 게임이란?
//여러 사람이 순서를 정해 순서대로 수를 부르는 게임이다.
//만약 3, 6, 9 가 들어간 수를 불러야 하는 상황이라면, 그 수대신 "박수" 등을 친다.
//예를 들어 33 까지 진행했다면? "짝짝"과 같이 박수를 두번 치는 형식이다.

package game369;

import java.util.Scanner;

public class App {
    public static String printNum(int num) {
        String result = "";
        int xCount = 0; // X 개수
        while (num > 0) {
            int n = num % 10;
            // 자릿수가 3, 6, 9 일때
            if(n == 3 || n == 6 || n == 9) {
                xCount++;
            } else {
                result = n + result;
            }
            num /= 10;
        }

        if(xCount != 0) {
            result = "";
            for(int i = 0; i < xCount; i++) {
                result += "X";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("369 게임입니다. 숫자를 입력하세요: ");
        int num = scanner.nextInt();
        for(int i = 1; i <= num; i++) {
            System.out.print(printNum(i) + " ");
        }
    }
}
