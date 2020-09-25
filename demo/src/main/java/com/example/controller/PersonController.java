package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Person;
//import com.example.service.PersonService;

@RestController
@RequestMapping("/")
public class PersonController {
	
//   @Autowired
//   private PersonService personService;
   
//   @GetMapping(path = "/people")
//   public List<Person> findByLastName(
//         @RequestParam("name") String name) {
//    
//      return personService.findByLastName(name);
//    
//   }
   
	@GetMapping(path="/hello")
   public String sayHello() {
       return "Hello and Welcome to the EasyNotes application. You can create a new Note by making a POST request to /api/notes endpoint.";
   }
}
