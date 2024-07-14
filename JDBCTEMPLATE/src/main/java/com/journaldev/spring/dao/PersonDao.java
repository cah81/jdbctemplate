package com.journaldev.spring.dao;

import com.journaldev.model.Person;

import java.util.List;

public interface PersonDao {
    Person getPersonById(Long id);

    List<Person> getAllPersons();

    boolean deletePerson(Person person);

    boolean updatePerson(Person person);

    boolean createPerson(Person person);
}
