package com.api.spring.data.springdata.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_guest")
@SequenceGenerator(name="seq", sequenceName="seq_name")
public class Guest implements Serializable{

	private static final long serialVersionUID = 4744571906529014788L;
	
	@Id
	@GeneratedValue(generator="seq", strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="firstname", length=30)
	private String firstName;
	
	@Column(name="lastname", length=50)
	private String lastName;
	
	@Column(name="country", length=30)
	private String country;
	
	@Column(name="city", length=50)
	private String city;
	
	@Column(name="state", length=30)
	private String state;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
