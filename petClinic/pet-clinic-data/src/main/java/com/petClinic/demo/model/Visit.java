package com.petClinic.demo.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="visit")
public class Visit extends BaseEntity{
	
	@Column(name="date")
	private LocalDate date;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne
	private Pet pet;

	public Visit() {
	}

	public Visit(LocalDate date, String description, Pet pet) {
		this.date = date;
		this.description = description;
		this.pet = pet;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
	

}
