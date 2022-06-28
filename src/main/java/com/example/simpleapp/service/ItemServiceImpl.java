package com.example.simpleapp.service;

import com.example.simpleapp.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    List<Item> allItems = new ArrayList<>();

    @Override
    public void addItem(Item item) {
        allItems.add(item);
    }

    @Override
    public List<Item> getAllItems() {

        return allItems;
    }
}
