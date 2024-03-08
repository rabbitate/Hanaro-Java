package array;

import java.util.Arrays;
import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
//        Random r = new Random();
//        int num = r.nextInt(10); // 0 ~ 9
//        System.out.println(num);

        // 사이즈가 10인 int형 배열
        // 배열에 1 ~ 100까지의 숫자를 랜덤하게 넣고 합과 평균을 구하시오
        int num[] = new int[10];
        int visited[] = new int[100];
        int sum = 0; // 합계
        int avg = 0; // 평균
        int rnum;

        Random rand = new Random();

        for (int i = 0; i < num.length; i++) {
            while (true) {
                rnum = rand.nextInt(100) + 1;
                visited[rnum - 1] += 1;
                if (visited[rnum - 1] == 1) {
                    break;
                }
            }
            num[i] = rnum;
        }

        for(int n : num) {
            sum += n;
        }

        avg = sum / num.length;
        System.out.printf("합계: %d, 평균: %d\n", sum, avg);
        System.out.println(Arrays.toString(num));
    }
}
