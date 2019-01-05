package com.petclinic.service;

import java.util.Set;

import com.petclinic.model.Vet;
import com.petclinic.model.Vet;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

	public void deleteById(Long id)
	{
		super.deleteByID(id);
	}
	public Vet save(Vet Vet) {
		return super.save(Vet.getId(), Vet);
		
	}
	public Vet findById(Long id) {
		return super.findById(id);
		
	}
	public Set <Vet> findAll(){
		return super.findAll();
		
	}
	public void delete(Vet object) {
		super.delete(object);
	}

}
