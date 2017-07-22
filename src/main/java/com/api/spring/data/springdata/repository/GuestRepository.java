package com.api.spring.data.springdata.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.spring.data.springdata.model.Guest;

/**
 * Repository
 * No needs to implements any method with Spring-Data.
 * The pattern "findBy" is a rule by Spring-Data
 * @author sanches.java
 *
 */
@Repository
public interface GuestRepository extends CrudRepository<Guest, Long>{

	List<Guest> findByFirstName(String firstName);
	
	List<Guest> findByLastName(String lastName);
	
	List<Guest> findByCity(String city);
	
	List<Guest> findByState(String state);
	
}
