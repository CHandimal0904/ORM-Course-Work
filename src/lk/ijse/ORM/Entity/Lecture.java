package lk.ijse.ORM.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Lecture {
    @Id
    private String Lid;
    private String Lname;

    @ManyToMany(mappedBy = "lecList")
    private List<Subject> subList = new ArrayList<>();

    public Lecture() {
    }

    public Lecture(String lid, String lname, List<Subject> subList) {
        Lid = lid;
        Lname = lname;
        this.subList = subList;
    }

    public String getLid() {
        return Lid;
    }

    public void setLid(String lid) {
        Lid = lid;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public List<Subject> getSubList() {
        return subList;
    }

    public void setSubList(List<Subject> subList) {
        this.subList = subList;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "Lid='" + Lid + '\'' +
                ", Lname='" + Lname + '\'' +
                ", subList=" + subList +
                '}';
    }
}
