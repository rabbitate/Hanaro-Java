package array;

import java.util.Random;

public class Array7 {
    public static void main(String[] args) {
        // 5행 5열 배열에 랜덤하게 중복되지 않은 1 ~ 100까지의 수를 발생시킨다
        // 각 열 최대값의 합과 최소값의 합을 출력하시오
        Random r = new Random();
        boolean[] visited = new boolean[100];
        int rnum;
        int maxSum = 0;
        int minSum = 0;

        int[][] num = new int[5][5];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                while (true) {
                    rnum = r.nextInt(100) + 1;
                    if (visited[rnum-1] == false) {
                        num[i][j] = rnum;
                        visited[rnum-1] = true;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < num.length; i++) {
            int maxNum = num[0][i];
            int minNum = num[0][i];
            for (int j = 1; j < num[i].length; j++) {
                if(maxNum < num[j][i]) {
                    maxNum = num[j][i];
                }
                if(minNum > num[j][i]) {
                    minNum = num[j][i];
                }
            }
            maxSum += maxNum;
            minSum += minNum;
        }

        System.out.printf("최댓값의 합: %d, 최솟값의 합: %d", maxSum, minSum);
    }
}
