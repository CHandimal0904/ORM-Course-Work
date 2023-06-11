package lk.ijse.ORM.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private String id;
    private String name;
    private Double sallary;
    private String addres;

    public Student() {
    }

    public Student(String id, String name, Double sallary, String addres) {
        this.id = id;
        this.name = name;
        this.sallary = sallary;
        this.addres = addres;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSallary() {
        return sallary;
    }

    public void setSallary(Double sallary) {
        this.sallary = sallary;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sallary=" + sallary +
                ", addres='" + addres + '\'' +
                '}';
    }
}
