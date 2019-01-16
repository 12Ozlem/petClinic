package com.petClinic.demo.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.petClinic.demo.model.Owner;
import com.petClinic.demo.model.Pet;

@Service
@Qualifier("ownerServiceMap")
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{
	
	private PetTypeService petTypeService;
	private PetService pertService;	

	@Autowired
	public OwnerServiceMap(PetTypeService petTypeService, PetService pertService) {
		this.petTypeService = petTypeService;
		this.pertService = pertService;
	}
	public void deleteById(Long id)
	{
		super.deleteByID(id);
	}
	public Owner save(Owner owner) {
		
		if (owner != null)
		{
			if (owner.getPets()!=null)
			{
				owner.getPets().forEach(pet->
				{
					if(pet.getPetType()!=null)
					{
						if (pet.getPetType().getId() == null)
						{
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					}
					else {
						throw new RuntimeException("PetType is required.");
					}
					if (pet.getId()==null)
					{
						Pet savedPet = pertService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
		
			}
			
		}
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
