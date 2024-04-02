package first;

import java.lang.reflect.Array;
import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int[] arrayIndex1 = { 2, 0, 1, 3, 4 };
        int[] arrayIndex2 = { 1, 2, 0, 4, 3 };
        int[][] arrayNum = {
                { 22, 92, 32, 42, 52 },
                { 23, 93, 33, 43, 53 },
                { 24, 94, 34, 44, 54 },
                { 25, 95, 35, 45, 55 },
                { 26, 96, 36, 46, 56 } };

        int[] selectedArray = new int[arrayIndex1.length];

        for (int index = 0; index < arrayIndex1.length; index++) {
            int row = arrayIndex1[index];
            int col = arrayIndex2[index];
            selectedArray[index] = arrayNum[row][col];
        }

        Arrays.sort(selectedArray);

        int min = 1;
        int max = 1;

        for (int[] arr: arrayNum) {
            Arrays.sort(arr);
        }

        out: for (int i = 0; i < arrayIndex1.length; i++) {
            for (int j = 0; j < arrayIndex2.length; j++) {
                if (selectedArray[0] == arrayNum[j][i]) {
                    break out;
                }
                min++;
            }
        }

        out: for (int i = arrayIndex2.length - 1; i >= 0; i--) {
            for (int j = arrayIndex1.length - 1; j >= 0; j--) {
                if (selectedArray[arrayIndex1.length-1] == arrayNum[j][i]) {
                    break out;
                }
                max++;
            }
        }

        System.out.println("뽑힌 수들의 배열 : " + Arrays.toString(selectedArray));
        System.out.println("최소값 : " + selectedArray[0]);
        System.out.println("최대값 : " + selectedArray[selectedArray.length-1]);
        System.out.printf("최소값 %d은 전체 수에서 %d번째로 작은 수이다.\n", selectedArray[0], min);
        System.out.printf("최대값 %d은 전체 수에서 %d번째로 큰 수이다.\n", selectedArray[selectedArray.length-1], max);

    }
}

