package com.freelancecode.traprural.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.freelancecode.traprural.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
