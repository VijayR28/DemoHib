package com.mapping.MappingExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Laptop laptop = new Laptop();
       laptop.setLid(105);
       laptop.setLname("Asus");
       
       Student student = new Student();
       student.setMarks(20);
       student.setName("Mic");
       student.setRollno(4);
       student.getLaptop().add(laptop);
       
       //creating A CONFIGURATION
       Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
         
       //applysettings to serviceregistry
        
       ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
       
       //Creation a sessionFactory to build
       
       SessionFactory sessionfactory = con.buildSessionFactory();
       
       //Creating a session to open
       
        Session session = sessionfactory.openSession();
       
        //Transaction for open and commit
        Transaction tx = session.beginTransaction();
        
         session.save(laptop);
        session.save(student);
        tx.commit();
        
        //closing the session and sessionfactory
        
        sessionfactory.close();
        session.close();
    }
       
    
}
