package com.petclinic.service;

import java.util.Set;

import com.petclinic.model.Owner;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

	public void deleteById(Long id)
	{
		super.deleteByID(id);
	}
	public Owner save(Owner owner) {
		return super.save(owner.getId(), owner);
		
	}
	public Owner findById(Long id) {
		return super.findById(id);
		
	}
	public Set <Owner> findAll(){
		return super.findAll();
		
	}
	public void delete(Owner object) {
		super.delete(object);
	}




}
