package com.hana.collection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class List3 {
    public static void main(String[] args) {
        List<UserDto> list = new ArrayList<>();
        list.add(new UserDto("id01", "pwd01", "james01", 10, 20000, LocalDate.parse("2024-03-14")));
        list.add(new UserDto("id02", "pwd02", "james02", 10, 20000, LocalDate.parse("2024-03-14")));
        list.add(new UserDto("id03", "pwd03", "james03", 10, 20000, LocalDate.parse("2024-03-14")));

        // 삭제
        for(UserDto u: list) {
            if(u.getId().equals("id03")) {
                list.remove(u);
                break;
            }
        }

        System.out.println(list);
        System.out.println("-------------------");
        list.add(new UserDto("id03", "pwd03", "james03", 10, 20000, LocalDate.parse("2024-03-14")));

        // 변경
        for(UserDto u: list) {
            if(u.getId().equals("id03")) {
                u.setName("말숙이");
                break;
            }
        }

        System.out.println(list);
        System.out.println("-------------------");

        // 조회
        for(UserDto u: list) {
            if(u.getId().equals("id03")) {
                System.out.println(u);
            }
        }
    }
}
