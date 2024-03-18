//4번 문제 - 컴퓨터와 함께 369게임하기
//컴퓨터와 현빈이가 369게임을 하게 되었다.
//컴퓨터가 먼저 숫자를 출력하되, 3이나 6이나 9가 들어 있으면, 박수 X 글자로 대신한다.
//현빈이는 직접 Scanner콘솔에 입력한다.
//        1부터 40까지 게임을 해서 누가 승리했는지 또는 무승부인지를 출력해보자.
//중간에 현빈(인간)이 숫자를 잘못 입력하면, 컴퓨터 승! 이라고 출력하고 게임종료 된다.
//출력예)
//컴퓨터 : 1
//나 : 2 입력후 엔터
//컴퓨터 : X
//나 : X 입력후 엔터
//컴퓨터 승!
//게임종료
//출력예)
//컴퓨터 : 1
//나 : 2 입력후 엔터
//컴퓨터 : X
//나 : 4 입력후 엔터
//컴퓨터 : 5
//나 : X
//…
//컴퓨터 : XX
//나 : 40 입력후 엔터
//무승부!
//게임종료

package game369withcom;

import java.util.Scanner;

public class App {
    public static String findAns(int num) {
        String result = "";
        int xCount = 0;

        while(num > 0) {
            int n = num % 10;
            if(n == 3 || n == 6 || n == 9) {
                xCount++;
            } else {
                result = n + result;
            }
            num /= 10;
        }

        if(xCount == 0) {
//            System.out.println(result);
            return result;
        } else {
            result = "";
            for(int i = 0; i < xCount; i++) {
                result += "X";
            }
//            System.out.println(result);
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("369 게임을 시작합니다. 숫자를 몇까지 할까요? ");
        int input = scanner.nextInt();
        boolean playerWins = true; // 플레이어 승리 여부
        for(int i = 1; i <= input; i++) {
            if(i % 2 == 1) {
                System.out.println("컴퓨터: " + findAns(i));
            } else {
                System.out.print("나: ");
                  String player = scanner.next();
                // 사용자가 순서에 맞는 숫자를 입력하지 않거나 답이 틀렸을 경우
                if (!player.equals(findAns(i))) {
                    playerWins = false;
                    break;
                }
            }
        }
        if(playerWins) {
            System.out.println("무승부!");
        } else {
            System.out.println("컴퓨터 승!");
        }
        System.out.println("게임 종료");
    }
}
