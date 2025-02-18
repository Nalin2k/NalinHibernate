package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.hibernate.model.Employee;


public class Main {

	public static void main(String[] args) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = meta.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("Start...");
		
		
		// to get all the records
//		Query query1 = session.createQuery("from Employee", Employee.class);
//		List list = query1.list();
//		System.out.println(list);
		
		
		//to get records with pagination
//		query1.setFirstResult(2);
//		query1.setMaxResults(15);
//		List list2 = query1.list();
//		System.out.println(list2);
		
		
//		Query q=session.createQuery("select max(name) from Employee",Employee.class);  
//		List<Integer> list1=q.list();  
//		System.out.println(list1);  
		
		
		//update query using named parameters
//		Query q = session.createQuery("update Employee set name=:n where id=:i");
//		q.setParameter("n", "Vishesh");
//		q.setParameter("i", 1);
//		System.out.println("status : " + q.executeUpdate());
		
		
		//delete query
		Query query = session.createQuery("Delete from Employee where id = 3");
		query.executeUpdate();
		
		Query query1 = session.createQuery("from Employee", Employee.class);
		List list = query1.list();
		System.out.println(list);
		
		tx.commit();
		session.close();
		sf.close();
	}

}
