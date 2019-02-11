package com.petClinic.demo.springDataJPA;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.petClinic.demo.model.Pet;
import com.petClinic.demo.repositories.PetRepository;
import com.petClinic.demo.service.PetService;

@Service
@Profile ("springdatajpa")
public class PetSpringDataJPAService implements PetService {
	
	private final PetRepository petRepository;
	
	public PetSpringDataJPAService(PetRepository petRepository) {
		this.petRepository = petRepository;
	}

	@Override
	public void deleteById(Long id) {
		petRepository.deleteById(id);
	}

	@Override
	public Pet save(Pet object) {
		return petRepository.save(object);
	}

	@Override
	public Pet findById(Long id) {	
		return petRepository.findById(id).orElse(null);
	}

	@Override
	public Set<Pet> findAll() {
		Set <Pet> petSet = new HashSet<>();
		petRepository.findAll().forEach(petSet::add);
		return petSet;
	}

	@Override
	public void delete(Pet object) {
		petRepository.delete(object);
	}

}
