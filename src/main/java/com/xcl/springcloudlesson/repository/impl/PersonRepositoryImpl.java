package com.xcl.springcloudlesson.repository.impl;

/**
 * @author: xuchunlin
 * @date: 09/28/2019/14:38
 * @description:
 *
 */

import com.xcl.springcloudlesson.entity.Person;
import com.xcl.springcloudlesson.repository.PersonRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
    private final Map<Long, Person> repository = new HashMap<>();

    /**
     * 从缓存中取值
     * @param id
     * @return
     */
    @Override
    public Person findPersonById(Long id) {
        return repository.get(id);
    }

    @Override
    public boolean savePerson(Person person) {
        return repository.putIfAbsent(person.getId(), person) == null;
    }
}
