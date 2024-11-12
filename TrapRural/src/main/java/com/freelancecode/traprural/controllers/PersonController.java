package com.freelancecode.traprural.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freelancecode.traprural.entities.Person;
import com.freelancecode.traprural.services.PersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {

	 @Autowired
	    private PersonService personService;

	    @GetMapping
	    public List<Person> listarTodos() {
	        return personService.findAll();
	    }

	    @GetMapping("/{id}")
	    public Person buscarPorId(@PathVariable Long id) {
	        return personService.findById(id);
	    }

	    @PostMapping
	    public Person criar(@RequestBody Person person) {
	        return personService.save(person);
	    }

	    @PutMapping("/{id}")
	    public Person atualizar(@PathVariable Long id, @RequestBody Person person) {
	        person.setId(id);
	        return personService.save(person);
	    }

	    @DeleteMapping("/{id}")
	    public void deletar(@PathVariable Long id) {
	        personService.deleteById(id);
	    }
}
