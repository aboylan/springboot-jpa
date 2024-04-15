package com.aboylan.curso.springboot.jpa.springbootjpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.aboylan.curso.springboot.jpa.springbootjpa.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
