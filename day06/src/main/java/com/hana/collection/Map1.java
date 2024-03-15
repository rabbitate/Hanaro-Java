package com.hana.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key01", "value01");
        map.put("key02", "value02");
        map.put("key03", "value03");

        System.out.println(map.get("key02"));
        Set<String> keys = map.keySet(); // key는 중복된 값이 없기 때문에 Set에 넣는다

        keys.forEach((k) -> System.out.println(k));

        Collection<String> col = map.values();
        col.forEach((v) -> System.out.println(v));
    }
}
