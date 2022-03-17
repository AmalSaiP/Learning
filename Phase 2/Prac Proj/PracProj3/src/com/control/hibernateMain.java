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
		Player p1=new Player(10,"Amal","India",20);
		session.save(p1);
		
		Player p2=new Player(30,"John","USA",40);
		session.save(p2);
	
		Player p3=new Player(40,"Steve","UK",60);
		session.save(p3);
		transaction.commit();
		session.close();
  		
		
		
		
		
		
		
		
	}

}
