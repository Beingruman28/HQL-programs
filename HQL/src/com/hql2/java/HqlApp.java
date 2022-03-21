package com.hql2.java;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hql1.java.Hqluser;



public class HqlApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Hqluser.class)
				.buildSessionFactory();
		
		Session session =factory.getCurrentSession();
		
		try {
			//create object of entity class type 
			//start transaction
			session.beginTransaction();
			
			@SuppressWarnings("unchecked")
			List<Hqluser> hql = session.createQuery("select from hql").getResultList();
			
			for(Hqluser temp:hql)
			{
				System.out.println(temp);
			}
			
			//COMMIT Transaction
			session.getTransaction().commit();
			//Perform operation
		    
			
			
			//Updating object
		
			
			//deleting object
			
			//commit the transaction 
			//session.getTransaction().commit();
			
		}finally {
			session.close();
			factory.close();
	
		}

	}

}
