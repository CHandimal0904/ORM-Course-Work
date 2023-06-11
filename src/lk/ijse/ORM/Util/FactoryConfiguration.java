package lk.ijse.ORM.Util;

import lk.ijse.ORM.Entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.security.acl.Owner;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration = new Configuration().configure()
//                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Laptop.class)
                .addAnnotatedClass(Childern.class)
                .addAnnotatedClass(Pet.class)
                .addAnnotatedClass(Pet_Owner.class)
                .addAnnotatedClass(Lecture.class)
                .addAnnotatedClass(Subject.class);
         sessionFactory = configuration.buildSessionFactory();
    }
    public static FactoryConfiguration getInstance() {
        return (factoryConfiguration==null) ? factoryConfiguration = new FactoryConfiguration()
                : factoryConfiguration;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}
