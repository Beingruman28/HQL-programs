package com.hibernate.hql1;
//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
				.configure("hibernate1.cfg.xml")
				.addAnnotatedClass(Hibernate.class)
				.buildSessionFactory();
		
		Session session =factory.getCurrentSession();
		
		try {
			//start transaction
			session.beginTransaction();
			
			//create object of entity class type 
			
			
			//@SuppressWarnings("unchecked")
			//List<Hibernate> hibernate = session.createQuery("from Hibernate ").getResultList();
			/*List<Hibernate> hibernate = session.createQuery("from Hibernate where user_lname='sharma'"+ "AND user_fname='rohit'").getResultList();
			for(Hibernate temp:hibernate)
			{
				System.out.println(temp);
			}
			*/
			//update query
			//session.createQuery("update Hibernate set user_email='indiacap@org.in' where user_fname='virat'").executeUpdate();
			
			//delete query
			session.createQuery("delete Hibernate where user_email='shikhar@org.in'").executeUpdate();
			
		}finally {
			session.close();
			factory.close();
	
		}

	}

}
