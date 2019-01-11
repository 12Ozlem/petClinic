package com.petClinic.demo.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.petClinic.demo.model.Owner;

@Service
@Qualifier("ownerServiceMap")
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

	public void deleteById(Long id)
	{
		super.deleteByID(id);
	}
	public Owner save(Owner owner) {
		return super.save(owner);
		
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
	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}




}
