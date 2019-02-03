package com.petClinic.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name ="vet")
public class Vet extends Person {

	@OneToMany(mappedBy="vet")
	Set <Speciality> spec = new HashSet<>();

	public Vet() {

	}

	public Vet(Set<Speciality> spec) {
		this.spec = spec;
	}

	public Set<Speciality> getSpec() {
		return spec;
	}

	public void setSpec(Set<Speciality> spec) {
		this.spec = spec;
	}

	
	
	
	
	
}
