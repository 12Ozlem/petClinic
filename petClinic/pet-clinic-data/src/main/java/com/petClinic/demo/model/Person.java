package com.petClinic.demo.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.NoArgsConstructor;

@MappedSuperclass
@NoArgsConstructor
public class Person extends BaseEntity{
	
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	
	


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(Long id, String firstName, String lastName) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
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
	
	

}
