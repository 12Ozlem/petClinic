package com.petclinic.service;

import java.util.Set;

import com.petclinic.model.Owner;
import com.petclinic.model.Vet;

public interface VetService {

	Vet findById(Long Id);
	
	Vet save (Owner owner);
	
	Set <Vet> findAll();
}
