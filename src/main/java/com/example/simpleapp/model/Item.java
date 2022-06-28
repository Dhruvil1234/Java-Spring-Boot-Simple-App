package com.example.simpleapp.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Item {

    private String state;
    private int id;
    private String name;
}
