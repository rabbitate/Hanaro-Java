package com.hana.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class MyDate {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getYear()); // 1900년을 기준으로 한다
        System.out.println(d.getMonth()); // 달이 0부터 시작

        System.out.println("------------------");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate1 = LocalDate.of(2024,3,14); // 특정 시간대의 LocalDate를 만들 수 있다
        LocalDate localDate2 = LocalDate.parse("2024-03-14");
        System.out.println(localDate1);
        System.out.println(localDate2);

        System.out.println("------------------");

        LocalDateTime localDateTime1 =
                LocalDateTime.of(2024,03,11,11,11,11);
        System.out.println(localDateTime1);
        LocalDateTime localDateTime2 =
                LocalDateTime.parse("2024-03-11T11:11:11");
        System.out.println(localDateTime2);

    }
}
