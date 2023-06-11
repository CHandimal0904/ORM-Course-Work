package lk.ijse.ORM.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Childern {
    @Id
    private String id;
    private String Name;

    public Childern() {
    }

    public Childern(String id, String name) {
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

    @Override
    public String toString() {
        return "Owner{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
