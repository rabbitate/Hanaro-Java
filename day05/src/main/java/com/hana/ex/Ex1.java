package com.hana.ex;

public class Ex1 {
    public static void main(String[] args) {
//        int i = 10 / 0; // Runtime Exception
//        System.out.println(i);
        int j = 10 / 2;
        System.out.println(j);
        String str = "1,000";

        int num = 0;
        try {
            num = Integer.parseInt(str); // Exception
            System.out.println(num); // Exception이 발생하지 않는다면 실행된다
        } catch (Exception e) {
            // 오류가 발생하면 catch문으로
            System.out.println("입력값 오류");
//            e.printStackTrace();
        }


        int[] arr = {1,2,3};
        for(int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]); // Exception
        }
    }
}
