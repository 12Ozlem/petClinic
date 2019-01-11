package com.petClinic.demo.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.petClinic.demo.model.Vet;

@Service
@Qualifier("vetServiceMap")
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	public void deleteById(Long id)
	{
		super.deleteByID(id);
	}
	public Vet save(Vet Vet) {
		return super.save(Vet);
		
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
