package com.hana.collection;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("V");
        System.out.println(list.toString());

        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("");

        list.stream().forEach((s) -> {
            System.out.println(s);
        });

        System.out.println("");

        list.remove("B");
        list.stream().forEach((s) -> {
            System.out.println(s);
        });

        System.out.println(list.indexOf("A"));
        System.out.println(list.get(1));

        list.remove("A");
    }
}
