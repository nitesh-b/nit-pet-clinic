package com.niteshb.nitpetclinic.bootstrap;

import com.niteshb.nitpetclinic.models.Owner;
import com.niteshb.nitpetclinic.models.Vet;
import com.niteshb.nitpetclinic.services.OwnerService;
import com.niteshb.nitpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;

	private final VetService vetService;

	// We dont want this, we want spring to initiate class; Dependency INjection
	// public DataLoader() {
	// this.ownerService = new OwnerServiceMap();
	// this.vetService = new VetServiceMap();
	// }

	// For constructor like this autowire is not necessary

	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {

		Owner owner = new Owner();
		owner.setId(1L);
		owner.setFirstName("Mark");
		owner.setLstName("Hamil");
		ownerService.save(owner);

		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Rucus");
		owner2.setLstName("Patao");
		ownerService.save(owner2);

		Owner owner3 = new Owner();
		owner3.setId(3L);
		owner3.setFirstName("Jamil");
		owner3.setLstName("Kamil");
		ownerService.save(owner3);

		Owner owner4 = new Owner();
		owner4.setId(4L);
		owner4.setFirstName("Todd");
		owner4.setLstName("Sadde");
		ownerService.save(owner4);

		System.out.println("Owner loaded...");

		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLstName("Bond");
		vet1.setId(1L);
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Tam");
		vet2.setLstName("Tond");
		vet2.setId(2L);
		vetService.save(vet2);

		Vet vet3 = new Vet();
		vet3.setFirstName("Pam");
		vet3.setLstName("Pond");
		vet3.setId(3L);
		vetService.save(vet3);

		System.out.println("Vet loaded...");
	}

}
