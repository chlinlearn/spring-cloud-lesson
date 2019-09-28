package com.xcl.springcloudlesson.controller;

import com.xcl.springcloudlesson.entity.Person;
import com.xcl.springcloudlesson.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: xuchunlin
 * @date: 09/28/2019/14:48
 * @description:
 */
@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/save")
    public Person save(@RequestBody Person person){
        personRepository.savePerson(person);
        return person;
    }

    @GetMapping("/get/{id}")
    public Person get(@PathVariable("id") Long id){
        return personRepository.findPersonById(id);
    }
}
