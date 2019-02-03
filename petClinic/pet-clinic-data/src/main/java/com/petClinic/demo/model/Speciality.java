package com.petClinic.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name = "speciality")
public class Speciality extends BaseEntity {
	
	@Column(name = "description")
	private String description;
	
	@ManyToMany(fetch= FetchType.EAGER)
	@JoinTable(name="vet_specialities", joinColumns= @JoinColumn(name="speciality_id"),
	inverseJoinColumns=@JoinColumn(name="vet_id"))
	Set <Vet> vet = new HashSet<Vet>();

	public Speciality() {
	}

	public Speciality(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	

}
