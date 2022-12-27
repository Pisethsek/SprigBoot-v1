package com.setec.repo;

import com.setec.model.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeopleRepo extends JpaRepository<People, Integer> {

    List<People> findByAddress(String address);

    List<People> findByName(String name);

    List<People> findByAge(int age);

    List<People> findByAgeGreaterThanEqual(int age);
}
