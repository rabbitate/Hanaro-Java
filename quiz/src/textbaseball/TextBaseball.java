//5번 문제 - 텍스트 야구 게임
//텍스트 기반의 야구게임을 만들어 보자. 1번 타자가 타석에 들어섰다.
//투수가 공을 던질때, 랜덤하게 던진다. 스트라이크을 던지면 숫자 0, 볼을 던지면 숫자 1로 처리한다.
//볼 카운트와 스트라이크 카운트를 세서
//볼카운트가 4개가 되면, "1루 진루!"라고 표시하거나,
//스트라이크가 3개가 되면, "삼진 아웃!"라고 표시하고,
//2번 타자가 타석에 들어선다.
//3번 타자까지 타석에 들어서서,
//아웃카운트가 3이 되면, “게임 종료!” 메시지를 출력하고 종료된다.
//3번타자가 또 1루 진루!하면 4번 타자가 타석에 들어선다.
//단, 만루 후 홈에 타자가 들어오더라도 별도의 출력은 없다.
//공을 던지는 간격은 1초이다. Thread.sleep() 함수이용.
//출력예)
//게임시작!
//1번타자
//볼~
//볼~
//스트라이크!
//스트라이크!
//스트라이크!
//삼진 아웃!
//2번타자
//볼~
//볼~
//스크라이크!
//볼~
//볼~
//1루 진루!
//3번타자
//스크라이크!
//볼~
//볼~
//스크라이크!
//스크라이크!
//삼진 아웃!
//게임종료!

package textbaseball;

import java.util.Random;

public class TextBaseball {
    public static void main(String[] args) {
        int ballCnt = 0;
        int strikeCnt = 0;
        int outCnt = 0;
        int playerNum = 1;

        Random random = new Random();

        System.out.println("게임 시작!");
        while (outCnt != 3) {
            ballCnt = 0;
            strikeCnt = 0;
            System.out.printf("%d번 타자\n\n", playerNum);
            while (ballCnt != 4 && strikeCnt != 3) {
                try {
                    Thread.sleep(1000);
                    // 0일때 스트라이크, 1일때 볼
                    int randomBall = random.nextInt(2);
                    if(randomBall == 0) {
                        System.out.println("스트라이크!");
                        strikeCnt++;
                    } else if(randomBall == 1) {
                        System.out.println("볼~");
                        ballCnt++;
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if (ballCnt == 4) {
                System.out.println("1루 진루!");
            }

            if (strikeCnt == 3) {
                System.out.println("삼진 아웃!");
                outCnt++;
            }
            playerNum++;
            System.out.println("");
        }
        System.out.println("게임 종료!");
    }
}
