package com.petClinic.demo.model;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "speciality")
public class Speciality extends BaseEntity {
	
	@Column(name = "description")
	private String description;
	
	@ManyToOne
	private Vet vet;

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
