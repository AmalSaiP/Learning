package com.control;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.to.Player;


public class hibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Configuration configutation = new Configuration().configure();
		  configutation.addAnnotatedClass(com.to.Player.class);
		  StandardServiceRegistryBuilder builder=new
		  StandardServiceRegistryBuilder().applySettings(configutation.getProperties()) ;
		  SessionFactory factory=configutation.buildSessionFactory(builder.build());
		 
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Player p1=new Player(10,"Amit","India",30);
		session.save(p1);
		transaction.commit();
		session.close();
  		
		
		
		
		
		
		
		
	}

}
