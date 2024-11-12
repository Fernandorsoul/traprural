package com.freelancecode.traprural.Assembler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freelancecode.traprural.entities.Person;
import com.freelancecode.traprural.repositories.PersonRepository;
import com.freelancecode.traprural.services.PersonService;

@Service
public class PersonAssembler implements PersonService {
	
	  @Autowired
	    private PersonRepository personRepository;

	    @Override
	    public List<Person> findAll() {
	        return personRepository.findAll();
	    }

	    @Override
	    public Person findById(Long id) {
	        return personRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Person save(Person person) {
	        return personRepository.save(person);
	    }

	    @Override
	    public void deleteById(Long id) {
	        personRepository.deleteById(id);
	    }

}
