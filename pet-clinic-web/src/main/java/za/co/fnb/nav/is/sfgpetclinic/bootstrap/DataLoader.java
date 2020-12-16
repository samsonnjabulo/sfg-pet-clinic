package za.co.fnb.nav.is.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import za.co.fnb.nav.is.sfgpetclinic.model.Owner;
import za.co.fnb.nav.is.sfgpetclinic.model.Pet;
import za.co.fnb.nav.is.sfgpetclinic.model.PetType;
import za.co.fnb.nav.is.sfgpetclinic.model.Vet;
import za.co.fnb.nav.is.sfgpetclinic.services.OwnerService;
import za.co.fnb.nav.is.sfgpetclinic.services.PetService;
import za.co.fnb.nav.is.sfgpetclinic.services.PetTypeService;
import za.co.fnb.nav.is.sfgpetclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final PetService petService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, PetService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public void run(String... args) throws Exception {


        PetType cat = new PetType();
        cat.setName("Leopard");
        PetType savedCatPetType = petTypeService.save(cat);

        PetType dog = new PetType();
        cat.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        System.out.println("Loaded PetType.....");
        System.out.println("Pettype Count: " + petTypeService.findAll().stream().count());


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1231231234");

        //owner1.setPets(savedCatPetType);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("9th Road Midrand");
        owner2.setCity("Miami");
        owner2.setTelephone("856785684");
        ownerService.save(owner2);

        System.out.println("Loaded owners.....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        // vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vet.....");
        System.out.println("Vet Count: " + vetService.findAll().stream().count());
/*        if(vet2.getFirstName().equals("Jessie"))
        throw new RuntimeException("something went wrong");*/

        Pet petCat = new Pet();
        petCat.setName("Mouse");
        petCat.setPetType(savedCatPetType);
        petCat.setBirthDate(LocalDate.now());
        petCat.setOwner(owner1);
        Pet savedPetCat = petService.save(petCat);

        Pet petDog = new Pet();
        petDog.setName("Papi");
        petDog.setPetType(savedDogPetType);
        petDog.setBirthDate(LocalDate.now());
        petDog.setOwner(owner2);
        Pet savedPetDog = petService.save(petDog);

        System.out.println("Loaded Pet.....");
        System.out.println("Pet Count: " + petService.findAll().stream().count());
        System.out.println("Pet " + savedPetCat.getPetType().getName() + ":  is owned by " + savedPetCat.getOwner().getFirstName());

        owner1.getPets().add(petCat);

    }
}
