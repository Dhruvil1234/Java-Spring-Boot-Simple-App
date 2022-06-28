package com.example.simpleapp.controller;

import com.example.simpleapp.exception.PersonNotFoundException;
import com.example.simpleapp.model.Item;
import com.example.simpleapp.model.Person;
import com.example.simpleapp.service.ItemServiceImpl;
import com.example.simpleapp.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemsController {

    @Autowired
    private ItemServiceImpl itemService;

    @PostMapping("/item")
    public void addPerson(@RequestBody Item item) {
        itemService.addItem(item);
    }


    @GetMapping("/items")
    public List<Item> getItems(){
        return itemService.getAllItems();
    }

    /*@GetMapping("/persons/{id}")
    public Person getPersonById(@PathVariable int id) throws Exception {
        List<Person> personList = personService.getAllPersons();
        for(int i = 0; i < personList.size(); i++){
            if(personList.get(i).getId() == id)
                return personList.get(i);
        }
        throw new PersonNotFoundException("person not found ! ");
    }
*/

}