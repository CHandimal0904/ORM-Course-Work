package lk.ijse.ORM.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Pet_Owner {
    @Id
    private String Oid;
    private String Name;
    @OneToMany(mappedBy = "pet_owner")
    private List<Pet> petList = new ArrayList<>();

    public Pet_Owner() {
    }

    public Pet_Owner(String oid, String name, List<Pet> petList) {
        Oid = oid;
        Name = name;
        this.petList = petList;
    }

    public String getOid() {
        return Oid;
    }

    public void setOid(String oid) {
        Oid = oid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }

    @Override
    public String toString() {
        return "Pet_Owner{" +
                "Oid='" + Oid + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
