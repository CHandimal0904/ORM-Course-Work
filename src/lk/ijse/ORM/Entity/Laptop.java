package lk.ijse.ORM.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
    @Id
    private String Lid;
    private String discription;
    private String name;
    @OneToOne
    private Childern childern;

    public Childern getChildern() {
        return childern;
    }

    public void setChildern(Childern childern) {
        this.childern = childern;
    }

    public Laptop() {
    }

    public Laptop(String lid, String discription, String name, Childern childern) {
        Lid = lid;
        this.discription = discription;
        this.name = name;
        this.childern = childern;
    }

    public String getLid() {
        return Lid;
    }

    public void setLid(String lid) {
        Lid = lid;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Lid='" + Lid + '\'' +
                ", discription='" + discription + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
