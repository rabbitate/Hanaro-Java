package org.example.app.dao;

import org.example.app.data.ItemDto;
import org.example.app.frame.Dao;

import java.util.ArrayList;
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
        System.out.println("Oracle DB:Updated ... " + itemDto);
        return 0;
    }

    @Override
    public ItemDto select(String s) {
        return ItemDto.builder().id(1).name("노트북").price(1000000).build();
    }

    @Override
    public List<ItemDto> select() {
        List list = new ArrayList<ItemDto>();
        list.add(ItemDto.builder().id(1).name("노트북").price(10000000).build());
        list.add(ItemDto.builder().id(2).name("볼펜").price(3000).build());
        list.add(ItemDto.builder().id(3).name("비타민").price(50000).build());
        return list;
    }
}
