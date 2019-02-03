package com.petClinic.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name ="vet")
public class Vet extends Person {

	@ManyToMany(fetch= FetchType.EAGER)
	@JoinTable(name="vet_specialities", joinColumns= @JoinColumn(name="vet_id"),
	inverseJoinColumns=@JoinColumn(name="speciality_id"))
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
