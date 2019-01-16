package com.petClinic.demo.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.petClinic.demo.model.Owner;
import com.petClinic.demo.model.Pet;
import com.petClinic.demo.model.PetType;
import com.petClinic.demo.model.Vet;
import com.petClinic.demo.service.OwnerService;
import com.petClinic.demo.service.PetTypeService;
import com.petClinic.demo.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	
	/*
	public DataLoader() {

		ownerService = new ownerServiceMap();
		vetService = new vetServiceMap();
	}
	*/
	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {
		
		PetType dog = new PetType();
		dog.setName("dog");
		PetType saveddDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("cat");
		PetType savedCatPetType = petTypeService.save(cat);
		
		Owner owner = new Owner();
		owner.setFirstName("Ozlem");
		owner.setLastName("Dogan");
		owner.setAddress("Uskudar");
		owner.setCity("İstanbul");
		owner.setTelephone("1234");

		Pet ozlemsPet = new Pet();
		ozlemsPet.setBirthDate(LocalDate.now());
		ozlemsPet.setOwner(owner);
		ozlemsPet.setPetType(saveddDogPetType);
		ozlemsPet.setName("Funky");
		//owner.setId(1L);
		
		owner.getPets().add(ozlemsPet);
		
		ownerService.save(owner);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Dogan");
		owner.setAddress("Uskudar");
		owner.setCity("İstanbul");
		owner.setTelephone("1234");
		owner.setPets(null);
		//owner2.setId(2L);
		
		
		ownerService.save(owner2);
		
		Pet fionasPet = new Pet();
		fionasPet.setBirthDate(LocalDate.now());
		fionasPet.setOwner(owner2);
		fionasPet.setPetType(savedCatPetType);
		fionasPet.setName("Shrinky");
		
		owner2.getPets().add(fionasPet);
		
		Vet vet = new Vet();
		vet.setFirstName("Emre");
		vet.setLastName("Doğan");
		//vet.setId(1L);
		
		vetService.save(vet);
		
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Emir Mete");
		vet2.setLastName("Doğan");
		//vet2.setId(2L);
		
		vetService.save(vet2);
		
		
	}

}
