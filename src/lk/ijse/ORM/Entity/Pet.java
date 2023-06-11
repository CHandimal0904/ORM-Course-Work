package lk.ijse.ORM.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pet {
    @Id
    private String id;
    private String Name;

   @ManyToOne
    private Pet_Owner pet_owner;

    public Pet() {
    }

    public Pet(String id, String name) {
        this.id = id;
        Name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Pet_Owner getPet_owner() {
        return pet_owner;
    }

    public void setPet_owner(Pet_Owner pet_owner) {
        this.pet_owner = pet_owner;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
