package org.example.app.frame;

import java.util.List;

public interface Dao<K,V> {
    /**
     * 2024.3.13
     * MINPYO KIM
     * @param v: CustDto
     * @return int
     */
    int insert(V v);
    int delete(K k);
    int update(V v);
    V select(K k);

    List<V> select(); // 선택한 것을 리스트에 담는다
}
