//9번 문제 - 숫자 스무고개
//컴퓨터가 1에서 100까지의 숫자중 하나를 랜덤으로 선택하고 사용자가 숫자를 입력하면 컴퓨터가 만든 값보다 큰지 작은지를 알려줍니다.
//사용자가 정답을 찾을 때까지 반복합니다.
//숫자 맞추기 게임 실행 결과입니다.

package guessnum;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randNum = random.nextInt(100) + 1;

        while (true) {
            System.out.println("번호를 입력하세요");
            int input = scanner.nextInt();
            if (randNum == input) {
                System.out.println("정답입니다");
                break;
            } else if (randNum > input) {
                System.out.println("번호가 정답보다 작습니다");
            } else if (randNum < input) {
                System.out.println("번호가 정답보다 큽니다");
            }
        }
    }
}
