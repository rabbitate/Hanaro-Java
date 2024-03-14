package com.hana.ex;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Database Connection");
        try {
            int i = 10 / 0;
        } catch (Exception e) {
            System.out.println("Database Error");
            return; // Exception 발생 시 함수 종료
        } finally {
            System.out.println("Database Close"); // 무조건적으로 실행되는 블록
        }
    }
}
