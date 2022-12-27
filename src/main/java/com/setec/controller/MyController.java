package com.setec.controller;

import com.setec.model.People;
import com.setec.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/people")
public class MyController {

    @Autowired
    private PeopleService people;


    //find all people i database
    @GetMapping("/")
    public List<People> listAllPeople(){
        return people.listAllPeople();
    }


    //find by id in database
    @GetMapping("/id/{id}")
    public People findById(@PathVariable int id){
        return people.findById(id);
    }

    @GetMapping("/address/{address}")
    public List<People> findByAddress(@PathVariable String address){
        return people.findByAddress(address);
    }

    @GetMapping("/name/{name}")
    public List<People> findByName(@PathVariable String name){
        return people.findByName(name);
    }

    @GetMapping("/age/{age}")
    public List<People> findByAge(@PathVariable int age){
        return people.findByAge(age);
    }

    @GetMapping("/age/equal/{age}")
    public List<People> findByAgeGreaterThanEqual(@PathVariable int age){
        return people.findByAgeGreaterThanEqual(age);
    }

}
