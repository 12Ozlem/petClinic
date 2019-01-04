package com.petclinic.service;

import java.util.Set;

import com.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);
	


}
