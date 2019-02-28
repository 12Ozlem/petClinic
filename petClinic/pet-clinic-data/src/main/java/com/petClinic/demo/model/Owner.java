package com.petClinic.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name="owners")
@NoArgsConstructor
@Data
public class Owner extends Person {
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy= "owner")
	private Set <Pet> pets = new HashSet <Pet>();
	
	@NotEmpty
	@Column(name  = "address")
	private String address;
	@Column(name  = "city")
	private String city;
	@Column(name  = "telephone")
	private String telephone;

	

	public Owner() {
		super();
	}



	public Owner(Long id, String firstName, String lastName) {
		super(id, firstName, lastName);
		// TODO Auto-generated constructor stub
	}



	@Builder
	public Owner(Long id, String address, String city, String telephone, Set<Pet> pets, String firstName,
			String lastName) {
		super(id, firstName, lastName);
		this.address = address;
		this.city = city;
		this.telephone = telephone;
		
		if (pets== null)
		{
			this.pets = pets;
		}
	}



	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public Set<Pet> getPets() {
		return pets;
	}


	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
		

}
