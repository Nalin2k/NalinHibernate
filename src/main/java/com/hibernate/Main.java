package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import com.hibernate.model.Employee;

public class Main {

	public static void main(String[] args) {
		Employee vikas = new Employee("Vikas Kumar", "Male", 44000);
//		Configuration cfg = new Configuration().configure(); 
//		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = meta.buildSessionFactory();
		Session session = sf.openSession();
//		session.persist(vikas);        
//		Transaction tx = session.beginTransaction();
//		tx.commit();
	}

}
