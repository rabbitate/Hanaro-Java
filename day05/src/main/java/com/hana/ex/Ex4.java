package com.hana.ex;

public class Ex4 {
    public static void main(String[] args) {
        int i = 10 / 2;
        System.out.println(i);
        String str = "1000";
        int num = 0;
//        try {
//            num = Integer.parseInt(str); // Exception
//            System.out.println(num); // Exception이 발생하지 않는다면 실행된다
//            int result = 10 / 0;
//        } catch (Exception e) {
//            System.out.println("End");
//            // 밑에 Exception들이 잡히지 않아서 오류 발생한다
//        } catch (NumberFormatException e) {
//            // 오류가 발생하면 catch문으로
//            System.out.println("입력값 오류");
////            e.printStackTrace();
//        } catch (ArithmeticException e) {
//            System.out.println("분모가 0 입니다");
//        }
        try {
            num = Integer.parseInt(str); // Exception
            System.out.println(num); // Exception이 발생하지 않는다면 실행된다
            int result = 10 / 0;
        } catch (NumberFormatException | ArithmeticException e) {
            // 오류가 발생하면 catch문으로
            System.out.println("입력값 오류");
//            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("End");
        }
    }
}
