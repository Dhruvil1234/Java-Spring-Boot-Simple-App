package com.example.simpleapp.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="firstname")
    private String name;

    @Column(name= "surname")
    private String surname;

    @Column(name="age")
    private int age;

    @Column(name="covidinfo")
    private String covidInfo;


}
