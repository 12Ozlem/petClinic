package com.petClinic.demo.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.petClinic.demo.model.Owner;
import com.petClinic.demo.model.Vet;
import com.petClinic.demo.service.OwnerService;
import com.petClinic.demo.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	
	/*
	public DataLoader() {

		ownerService = new ownerServiceMap();
		vetService = new vetServiceMap();
	}
	*/
	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Owner owner = new Owner();
		owner.setFirstName("Ozlem");
		owner.setLastName("Dogan");
		//owner.setId(1L);
		
		ownerService.save(owner);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Dogan");
		//owner2.setId(2L);
		
		ownerService.save(owner2);
		
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
