package com.hana.frame;

import com.hana.exception.DuplicatedIdException;
import com.hana.exception.IdNotFoundException;
import com.hana.exception.NotFoundException;

import java.util.List;

public interface Service<K, V> {
    int add(V v) throws DuplicatedIdException;
    int del(K k) throws IdNotFoundException;
    int modify(V v) throws IdNotFoundException;
    V get(K k) throws NotFoundException;
    List<V> get() throws Exception;
}