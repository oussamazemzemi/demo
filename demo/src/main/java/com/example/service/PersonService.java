package com.example.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Person;

public interface PersonService extends MongoRepository<Person, Long> {

//  List<Person> findByLastName(@Param("name") String name);

}