// 1번문제 - 알바천국
//        알바생 홍길동은 월, 수, 금, 일 아르바이트를 간다.
//        다음은 요일의 순서이다.
//        월요일 (1)
//        화요일 (2)
//        수요일 (3)
//        목요일 (4)
//        금요일 (5)
//        토요일 (6)
//        일요일 (7)
//        요일의 번호가 입력으로 주어지면 그 날이 아르바이트 가는 날이면 "oh my god"를 가는 날이 아니면 "enjoy"를 출력하시오.
//        입력
//        Scanner 콘솔 입력으로 요일의 번호가 하나 주어진다.(정수)
//        출력
//        아르바이트 가는 날이면 "oh my god~"를 가는 날이 아니면 "enjoy!"를 출력하시오.
//        입력 예시
//        1
//        출력 예시
//        oh my god~
//        입력 예시
//        2
//        출력 예시
//        enjoy!

package assignment.quiz.parttime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] workDay = {1,3,5}; // 일하는 날
        boolean isWork = false;
        System.out.println("월요일 (1), 화요일 (2), 수요일 (3), 목요일 (4), 금요일 (5), 토요일 (6), 일요일 (7)");
        System.out.print("요일을 입력하세요: ");
        int selectedDay = scanner.nextInt();

        for(int day: workDay) {
            if(day == selectedDay) {
                isWork = true;
            }
        }

        if(isWork) {
            System.out.println("oh my god~");
        } else {
            System.out.println("enjoy!");
        }
    }
}
