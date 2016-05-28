package com.cs.gslab.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cs.gslab.hibernate.dto.UserDetails;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		try {
			System.out.println("Hello World!");

			UserDetails userDetails = new UserDetails();
			userDetails.setUserId(1);
			userDetails.setUserName("ajinkya");
			userDetails.setPassword("password_ajinkya");

			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			System.out.println("Session factory created..!");
			// you can have multiple session objects

			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(userDetails);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
