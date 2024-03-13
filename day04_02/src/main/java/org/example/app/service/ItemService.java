package org.example.app.service;

import org.example.app.dao.ItemDao;
import org.example.app.data.ItemDto;
import org.example.app.frame.Dao;
import org.example.app.frame.Service;

import java.util.List;

public class ItemService implements Service<String, ItemDto> {
    Dao<String, ItemDto> dao;

    public ItemService() {
        dao = new ItemDao();
    }

    @Override
    public int add(ItemDto itemDto) {
        return 0;
    }

    @Override
    public int del(String s) {
        return 0;
    }

    @Override
    public int modify(ItemDto itemDto) {
        return 0;
    }

    @Override
    public ItemDto get(String s) {
        return null;
    }

    @Override
    public List<ItemDto> get() {
        return null;
    }
}
