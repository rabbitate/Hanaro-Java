package com.hana.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class MyDate2 {
    public static void main(String[] args) {
        // Local의 날짜와 시간을 가져오기
        Date date = new Date();
        LocalDate localDate =
                date.toInstant().atZone(ZoneId.of("Africa/Cairo")).toLocalDate();
        System.out.println(localDate);

        LocalDateTime localDate2 =
                date.toInstant().atZone(ZoneId.of("Africa/Cairo")).toLocalDateTime();
        System.out.println(localDate2);

        LocalDate localDate3 =
                date.toInstant().atZone(ZoneId.of("Asia/Seoul")).toLocalDate();
        System.out.println(localDate3);

        LocalDateTime localDate4 =
                date.toInstant().atZone(ZoneId.of("Asia/Seoul")).toLocalDateTime();
        System.out.println(localDate4);
    }
}
