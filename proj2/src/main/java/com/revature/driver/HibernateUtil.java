package com.revature.driver;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory mysession;
	private static ServiceRegistry REGISTRY;
	private HibernateUtil() {
		
	}
	
	public static SessionFactory getSession(){
		if (mysession == null){
			try{
				mysession = new Configuration().configure().buildSessionFactory();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return mysession;
	}
	
	public static SessionFactory buildSFactory() {
		if(REGISTRY == null) {
			REGISTRY = new StandardServiceRegistryBuilder().configure().build();
		}
		return new MetadataSources(REGISTRY).buildMetadata().buildSessionFactory();
	}
	
	public static void closeSession(){
		mysession.close();
	}
}
