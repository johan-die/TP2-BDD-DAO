package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Person;
 
@Repository
public interface PersonDAO extends CrudRepository<Person, Long> {
	@Query("SELECT p FROM Person p")
    public List<Person> findAllPersons();
	@Query("SELECT p FROM Person p where p.id = :id")
    public Optional<Person> findIdInPerson(@Param("id") Long id);
	
	@Query("SELECT p FROM Person p where fullName LIKE 'S%'")
	public List<Person> findNameStartingByS();
    
    public List<Person> findByFullNameLike(String name);
    
    public List<Person> findByFullNameStartingWith(String name);
 
    public List<Person> findBySalaryGreaterThan(Float f);
 
    public List<Person> findByIdGreaterThan(Long id);
}