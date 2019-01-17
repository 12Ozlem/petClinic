package com.petClinic.demo.service;

import java.util.Set;

import com.petClinic.demo.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);
	


}
