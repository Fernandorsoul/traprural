package com.freelancecode.traprural.services;

import java.util.List;

import com.freelancecode.traprural.entities.Person;

public interface PersonService{
	 List<Person> findAll();
	    Person findById(Long id);
	    Person save(Person person);
	    void deleteById(Long id);

}
