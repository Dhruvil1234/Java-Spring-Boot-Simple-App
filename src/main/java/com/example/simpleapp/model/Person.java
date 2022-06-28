package com.example.simpleapp.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@AllArgsConstructor
public class Person {


    private int id;

    @NotNull
    @Size(min=2, message="Name should have atleast 2 characters")
    private String name;
    private String surname;
    private int age;
    private String covidInfo;
}
