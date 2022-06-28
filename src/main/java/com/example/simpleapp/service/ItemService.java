package com.example.simpleapp.service;

import com.example.simpleapp.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    void addItem(Item item);

    List<Item> getAllItems();
}
