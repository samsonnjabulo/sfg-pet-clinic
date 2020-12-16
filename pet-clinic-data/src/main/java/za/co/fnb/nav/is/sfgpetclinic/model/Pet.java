package za.co.fnb.nav.is.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{

    private LocalDate birthDate;
    private Owner owner;
    private String name;
    private PetType petType;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public void setName(String name) {this.name = name; }
}
