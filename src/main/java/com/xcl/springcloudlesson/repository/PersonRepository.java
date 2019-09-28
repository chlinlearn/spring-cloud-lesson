package com.xcl.springcloudlesson.repository;

import com.xcl.springcloudlesson.entity.Person;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.NoRepositoryBean;

/* *
 * @author: xuchunlin
 * @date: 09/28/2019/14:32
 * @description: 人员仓库
 */
@NoRepositoryBean
public interface PersonRepository {
    @Cacheable(cacheNames = "persons")
    Person findPersonById(Long id);

    boolean savePerson(Person person);
}
