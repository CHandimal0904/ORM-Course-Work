package lk.ijse.ORM.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Subject {
    @Id
   private String Sid;
   private String name;
   @ManyToMany
   private List<Lecture> lecList = new ArrayList<>();
    public Subject() {
    }

    public Subject(String sid, String name, List<Lecture> lecList) {
        Sid = sid;
        this.name = name;
        this.lecList = lecList;
    }

    public List<Lecture> getLecList() {
        return lecList;
    }

    public void setLecList(List<Lecture> lecList) {
        this.lecList = lecList;
    }

    public String getSid() {
        return Sid;
    }

    public void setSid(String sid) {
        Sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "Sid='" + Sid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
