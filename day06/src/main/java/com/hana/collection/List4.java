package com.hana.collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class List4 {
    public static void main(String[] args) {
        Set<String> setData = new HashSet<>();
        setData.add("A");
        setData.add("B");
        setData.add("C");
        setData.add("A");
        setData.add("C");
        System.out.println(setData);

        // 1 ~ 100까지의 랜덤한 숫자(정수)를 중복 없이 10개 발생
        Set<Integer> randSet = new HashSet<>();
        Random random = new Random();
        while (randSet.size() != 10){
            randSet.add(random.nextInt(100)+1);
        }
        System.out.println(randSet);

        // 정렬
        randSet.stream().sorted().forEach((c) -> System.out.println(c));
    }
}
