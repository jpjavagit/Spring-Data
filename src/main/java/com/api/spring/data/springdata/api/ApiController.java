package com.api.spring.data.springdata.api;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.spring.data.springdata.model.Guest;
import com.api.spring.data.springdata.repository.GuestRepository;

@RestController
public class ApiController {

	@Autowired
	private GuestRepository repository;
	
	/**
	 * List of Guest Objects filtering by FistName property
	 * @param name : String
	 * @return List<Guest>
	 */
	@RequestMapping(path="/getByFirstName/{name}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON)
	public List<Guest> getByFirstName(@PathVariable("name") String name){
		List<Guest> guests = repository.findByFirstName(name);
		return guests;
	}
	
	/**
	 * List of Guest Objects filtering by LastName property
	 * @param lastName : String
	 * @return List<Guest>
	 */
	@RequestMapping(path="getByLastName/{lastName}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON)
	public List<Guest> getByLastName(@PathVariable("lastName") String lastName){
		List<Guest> guests = repository.findByLastName(lastName);
		return guests;
	}
	
	/**
	 * List of Guest Objects filtering by City property
	 * @param city : String
	 * @return List<Guest>
	 */
	@RequestMapping(path="getByCity/{city}", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON)
	public List<Guest> getByCity(@PathVariable("city") String city){
		List<Guest> guests = repository.findByCity(city);
		return guests;
	}
	
	/**
	 * List of Guest Objects filtering by State property
	 * @param state : String
	 * @return List<Guest> 
	 */
	@RequestMapping(path="getByState/{state}", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON)
	public List<Guest> getByState(@PathVariable("state") String state){
		List<Guest> guests = repository.findByState(state);
		return guests;
	}
	
	/**
	 * Save a Guest Object
	 * @param guest : Guest
	 * @return Guest
	 */
	@RequestMapping(path="/api", method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON, 
			produces=MediaType.APPLICATION_JSON)
	public Guest save(@RequestBody(required=true)Guest guest){
		return repository.save(guest);
	}

	/**
	 * Delete by Id property
	 * @param id : Long
	 * @return String
	 */
	@RequestMapping(path="/delete/{id}", method=RequestMethod.DELETE, 
			produces=MediaType.APPLICATION_JSON)
	public void delete(@PathVariable("id") Long id){
		repository.delete(id);
	}
	
	
}
