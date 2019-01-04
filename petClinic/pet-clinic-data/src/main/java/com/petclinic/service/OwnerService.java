package com.petclinic.service;

import java.util.Set;

import com.petclinic.model.Owner;

public interface OwnerService {
	
	Owner findById(Long Id);
	
	Owner save (Owner owner);
	
	Owner findByLastName(String lastName);
	
	Set <Owner> findAll();

}
