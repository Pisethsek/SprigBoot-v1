package com.setec.service;

import com.setec.model.People;
import com.setec.repo.PeopleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PeopleService {
    @Autowired
    private PeopleRepo people;

    public List<People> listAllPeople(){
        return people.findAll();
    }

    public People findById(@PathVariable int id){
        return people.findById(id).orElse(new People());
    }

    public List<People> findByAddress(String address) {
        return people.findByAddress(address);
    }

    public List<People> findByName(String name) {
        return people.findByName(name);
    }

    public List<People> findByAge(int age){
        return people.findByAge(age);
    }

    public List<People> findByAgeGreaterThanEqual(@PathVariable int age){
        return people.findByAgeGreaterThanEqual(age);
    }

}
