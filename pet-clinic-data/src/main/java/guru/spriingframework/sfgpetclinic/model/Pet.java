package guru.spriingframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate localDate;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
