package com.hqldemo.hibquerydemp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
    	//creating A CONFIGURATION
        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
          
        //applysettings to serviceregistry
         
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        
        //Creation a sessionFactory to build
        
        SessionFactory sessionfactory = con.buildSessionFactory();
         
        //Creating a session to open
        
         Session session = sessionfactory.openSession();
        
         //Transaction for open and commit
         Transaction tx = session.beginTransaction();
         
         //Storing employee data into database
//	         for(int i =1;i<=50;i++)
//	         {
//	        	Employee dept = new Employee();
//	        	//dept.setDeptno(i);
//	        	dept.setEname("name" + i);
//	        	dept.setEid(i+100);
//	        	session.save(dept);
//	         }
	        
         //-----------------Writing a HQL-------------------

         
       //  String hql = "from employee"; // to fetch all data 
         
        // String hql = "SELECT e.ename, e.eid FROM Employee e"; //Select Specific Columns
         
         
       //   String hql = "FROM Employee e WHERE e.eid > 30";  // Filter Data Using WHERE Clause
         
        // String hql = "SELECT COUNT(e) FROM Employee e "; //Count the number of employees.
        
         
        // String hql = "FROM Employee e ORDER BY e.eid DESC"; // Sort Data Using ORDER BY
       
//         String hql = "FROM Employee e ORDER BY e.eid DESC";
//         Query query = session.createQuery(hql);
//         query.setMaxResults(5);
//         List<Employee> employees = query.list();
//         System.out.println(employees);
//   
      
         //-----------------Writing a Native query---------------
	         
	     // String sql = "select * from emp ";
//            try {
//         String sql = "select * from emp ";
//	         Query query = session.createNativeQuery(sql,Employee.class);
//	        // query.executeUpdate();
//	         List<Employee> employees = query.list();
//	       //  System.out.println(employees);
//	         for (Employee employee : employees) {
//	        	 System.out.println(employee + " ");
//			}
//            }
//            catch (Exception e) {
//                if (tx!= null) {
//                    tx.rollback();
//                }
//                e.printStackTrace();
//            } finally {
//                session.close();
//            }
         
         String sql = "SELECT ROUND(eid) FROM Emp";
         Query query = session.createNativeQuery(sql);
         List<Object[]> results = query.getResultList();
         for (Object[] result : results) {
             System.out.println("Name: " + result[0] + ", Salary: " + result[1]);
         }

	                     
             
         tx.commit();
         System.out.println("column added!!");
         //closing the session and sessionfactory
         
         sessionfactory.close();
         session.close();
    }
}
