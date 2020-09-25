//package com.example.serviceImpl;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoOperations;
//import org.springframework.data.mongodb.core.query.CriteriaDefinition;
//import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.stereotype.Service;
//
//import com.example.model.Person;
//import com.example.service.PersonService;
//import com.jayway.jsonpath.Criteria;
//
//@Service(value = "PersonService")
//public class PersonServiceImpl implements PersonService {
//	
//   @Autowired
//   private MongoOperations mongoOperations;
//   
//   @Override
//   public List<Person> findByLastName(String name) {
//     List<Person> personnes = new ArrayList<>();
//     Query searchQuery = new Query();
//     searchQuery.addCriteria((CriteriaDefinition) Criteria.where("firstName").is(name));
//     personnes = mongoOperations.find(searchQuery, Person.class);
//     return personnes;
//   }
//}