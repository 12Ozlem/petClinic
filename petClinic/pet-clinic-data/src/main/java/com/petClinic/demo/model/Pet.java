package com.petClinic.demo.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{
	
	private LocalDate birthDate;
	
	private PetType petType;
	
	private Owner owner;
	
	private String name;

	public Pet() {

	}

	public Pet(LocalDate birthDate, PetType petType, Owner owner, String name) {
		this.birthDate = birthDate;
		this.petType = petType;
		this.owner = owner;
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pet [birthDate=" + birthDate + ", owner=" + owner + "]";
	}
		

}
