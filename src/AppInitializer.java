import lk.ijse.ORM.Entity.*;
import lk.ijse.ORM.Util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;


public class AppInitializer {
    public static void main(String[] args) {

//        Student s1 = new Student();
//
//        s1.setName("Saman");
//        s1.setAddres("Aluthgama");
//        s1.setId("S001");
//        s1.setSallary(25000.00);
//
//        Student s2 = new Student();
//        s2.setName("Sandun");
//        s2.setAddres("meegahathenna");
//        s2.setId("S002");
//        s2.setSallary(250000.00);
//
//        Session session = FactoryConfiguration.getInstance().getSession();
//
//        Transaction transaction = session.beginTransaction();
//        session.save(s1);
//        session.save(s2);
//
//        session.update(s2);
//
////        use id to select delete row
//        s1.setId("S001");
//        session.delete(s1);
//
//        transaction.commit();
//
//        session.close();
//        Customer c1 = new Customer();
//
//        c1.setId("C0001");
//        c1.setName("Saman");
//        c1.setAddress("Kaluthara");
//        c1.setSalary(260000.00);
//
//        Session session = FactoryConfiguration.getInstance().getSession();
//
//        Transaction transaction = session.beginTransaction();
//        session.save(c1);
//
//        c1.setId("C0001");
//        session.delete(c1);
//        transaction.commit();
//        session.close();
//        Laptop l1 = new Laptop();
//        l1.setName("Hp");
//        l1.setDiscription("Laptop");
//        l1.setLid("L001");
//
//        Childern ch1 = new Childern();
//        ch1.setId("S001");
//        ch1.setName("Shan");
//        l1.setChildern(ch1);

//        Pet_Owner o1 = new Pet_Owner();
//        o1.setName("Saman");
//        o1.setOid("O003");
//
//        Pet_Owner o2 = new Pet_Owner();
//        o2.setOid("O004");
//        o2.setName("Niamal");
//
//        Pet p1 = new Pet();
//        p1.setId("P003");
//        p1.setName("Cat");
//        p1.setPet_owner(o1);
//
//        Pet p2 = new Pet();
//        p2.setName("Dog");
//        p2.setId("P004");
//        p2.setPet_owner(o1);
//
//        Pet p3 = new Pet();
//        p3.setName("Rat");
//        p3.setId("P005");
//        p3.setPet_owner(o2);
//
//        Pet p4 = new Pet();
//        p4.setName("Rabbit");
//        p4.setId("P006");
//        p4.setPet_owner(o2);
//
//        ArrayList<Pet> petList = new ArrayList<>();
//        petList.add(p1);
//        petList.add(p2);
//
//        o1.setPetList(petList);
        Subject s1 = new Subject();
        s1.setSid("Sb001");
        s1.setName("OOP");

        Subject s2 = new Subject();
        s2.setSid("Sb002");
        s2.setName("PRF");


        Lecture l1 = new Lecture();
        l1.setLid("L001");
        l1.setLname("Niroth");

        Lecture l2 = new Lecture();
        l2.setLid("L002");
        l2.setLname("Pradeep");

        ArrayList<Subject> subList = new ArrayList<>();
        subList.add(s1);
        subList.add(s2);

        ArrayList<Lecture> lecList = new ArrayList<>();
        lecList.add(l1);
        lecList.add(l2);

        l1.setSubList(subList);
        l2.setSubList(subList);

        s1.setLecList(lecList);
        s2.setLecList(lecList);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

//        session.save(o1);
//        session.save(o2);
//        session.save(p1);
//        session.save(p2);
//        session.save(p3);
//        session.save(p4);
        session.save(l1);
        session.save(l2);
        session.save(s1);
        session.save(s2);


        transaction.commit();
        session.close();
    }
}
