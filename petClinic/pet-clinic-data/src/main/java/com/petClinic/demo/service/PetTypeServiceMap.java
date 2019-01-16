package com.petClinic.demo.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.petClinic.demo.model.PetType;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {

	@Override
	public void deleteById(Long id) {
		super.deleteByID(id);

	}

	@Override
	public PetType save(PetType object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Set<PetType> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public void delete(PetType object) {
		super.delete(object);

	}

}
