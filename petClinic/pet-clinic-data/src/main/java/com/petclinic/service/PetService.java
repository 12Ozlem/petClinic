package com.petclinic.service;

import java.util.Set;

import com.petclinic.model.Pet;

public interface PetService {

	Pet findById(Long Id);
	
	Pet save (Pet pet);
	
	Set <Pet> findAll();
}
