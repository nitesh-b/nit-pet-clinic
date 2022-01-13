package com.niteshb.nitpetclinic.bootstrap;

import com.niteshb.nitpetclinic.models.Owner;
import com.niteshb.nitpetclinic.models.Pet;
import com.niteshb.nitpetclinic.models.PetType;
import com.niteshb.nitpetclinic.models.Vet;
import com.niteshb.nitpetclinic.services.OwnerService;
import com.niteshb.nitpetclinic.services.PetTypeService;
import com.niteshb.nitpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;

	private final VetService vetService;

	private final PetTypeService petTypeService;

	// We dont want this, we want spring to initiate class; Dependency INjection
	// public DataLoader() {
	// this.ownerService = new OwnerServiceMap();
	// this.vetService = new VetServiceMap();
	// }

	// For constructor like this autowire is not necessary

	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {

		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedDogType = petTypeService.save(cat);

		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedCatType = petTypeService.save(dog);

		PetType horse = new PetType();
		horse.setName("Horse");
		PetType savedHorseType = petTypeService.save(horse);

		Owner owner = new Owner();
		owner.setFirstName("Mark");
		owner.setLstName("Hamil");
		owner.setAddress("123 Stoney Crk");
		owner.setCity("Kingsgrove");
		owner.setTelephone("0412345434");

		Pet markPet = new Pet();
		markPet.setName("Lucas");
		markPet.setOwner(owner);
		markPet.setPetType(savedDogType);
		markPet.setBirthDate(LocalDate.now());

		owner.getPets().add(markPet);
		ownerService.save(owner);

		Owner owner2 = new Owner();
		owner2.setFirstName("Rucus");
		owner2.setLstName("Patao");
		owner2.setAddress("456 Stoney Crk");
		owner2.setCity("Kingsgrove");
		owner2.setTelephone("0412345434");

		Pet rucusPet = new Pet();
		rucusPet.setName("Lucy");
		rucusPet.setOwner(owner2);
		rucusPet.setPetType(savedCatType);
		rucusPet.setBirthDate(LocalDate.now());
		owner2.getPets().add(rucusPet);
		ownerService.save(owner2);

		Owner owner3 = new Owner();
		owner3.setFirstName("Jamil");
		owner3.setLstName("Kamil");
		owner3.setAddress("789 Stoney Crk");
		owner3.setCity("Kingsgrove");
		owner3.setTelephone("0412345434");

		Pet jamilPet = new Pet();
		jamilPet.setName("Pascal");
		jamilPet.setOwner(owner3);
		jamilPet.setPetType(savedHorseType);
		jamilPet.setBirthDate(LocalDate.now());
		owner3.getPets().add(jamilPet);
		ownerService.save(owner3);

		Owner owner4 = new Owner();
		owner4.setFirstName("Todd");
		owner4.setLstName("Sadde");
		owner4.setAddress("000 Stoney Crk");
		owner4.setCity("Kingsgrove");
		owner4.setTelephone("0412345434");
		Pet toddPet = new Pet();
		toddPet.setName("Knight");
		toddPet.setOwner(owner4);
		toddPet.setPetType(savedHorseType);
		toddPet.setBirthDate(LocalDate.now());
		owner4.getPets().add(toddPet);
		ownerService.save(owner4);

		System.out.println("Owner loaded...");

		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLstName("Bond");
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Tam");
		vet2.setLstName("Tond");
		vetService.save(vet2);

		Vet vet3 = new Vet();
		vet3.setFirstName("Pam");
		vet3.setLstName("Pond");
		vetService.save(vet3);

		System.out.println("Vet loaded...");

	}

}
