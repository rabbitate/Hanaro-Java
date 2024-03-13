package org.example.app.dao;

import org.example.app.data.ItemDto;
import org.example.app.frame.Dao;

import java.util.List;

public class ItemDao implements Dao<String, ItemDto> {

    @Override
    public int insert(ItemDto itemDto) {
        System.out.println("Oracle DB:Inserted ... " + itemDto);
        return 0;
    }

    @Override
    public int delete(String s) {
        System.out.println("Oracle DB:Deleted ... " + s);
        return 0;
    }

    @Override
    public int update(ItemDto itemDto) {
        return 0;
    }

    @Override
    public ItemDto select(String s) {
        return null;
    }

    @Override
    public List<ItemDto> select() {
        return null;
    }
}
