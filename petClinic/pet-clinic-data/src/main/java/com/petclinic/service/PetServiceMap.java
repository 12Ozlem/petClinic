package com.petclinic.service;

import java.util.Set;

import com.petclinic.model.Pet;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	public void deleteById(Long id)
	{
		super.deleteByID(id);
	}
	public Pet save(Pet Pet) {
		return super.save(Pet.getId(), Pet);
		
	}
	public Pet findById(Long id) {
		return super.findById(id);
		
	}
	public Set <Pet> findAll(){
		return super.findAll();
		
	}
	public void delete(Pet object) {
		super.delete(object);
	}
}
