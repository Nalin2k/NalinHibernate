package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.hibernate.model.Employee;

public class Main {

	public static void main(String[] args) {
		Employee vikas = new Employee("Vikas Kumar", "Male", 44000);
		Configuration cfg = new Configuration().configure(); 
		SessionFactory sf =cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(vikas);
		tx.commit();
	}

}
