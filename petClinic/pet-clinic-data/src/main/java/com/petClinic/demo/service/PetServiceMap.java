package com.petClinic.demo.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.petClinic.demo.model.Pet;
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	public void deleteById(Long id)
	{
		super.deleteByID(id);
	}
	public Pet save(Pet Pet) {
		return super.save(Pet);
		
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
