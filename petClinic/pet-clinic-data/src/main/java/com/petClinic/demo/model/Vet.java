package com.petClinic.demo.model;

import java.util.Set;

public class Vet extends Person {

	Set <Speciality> spec;

	public Vet() {

	}

	public Vet(Set<Speciality> spec) {
		super();
		this.spec = spec;
	}

	public Set<Speciality> getSpec() {
		return spec;
	}

	public void setSpec(Set<Speciality> spec) {
		this.spec = spec;
	}

	
	
	
	
	
}
