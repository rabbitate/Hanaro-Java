package com.hana.ex;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
            System.out.println("Interrupted ..."); // 비정상 종료될때 실행된다
        }
        System.out.println("end");

        try {
            Class.forName("org.mysql.Driver");
        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println("File not Found ..."); // 파일을 찾지 못했을 때 실행된다
        }
    }
}
