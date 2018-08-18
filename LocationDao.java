package com.revature.dao;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.Location;
import com.revature.util.HibernateUtil;

public class LocationDao {

	public static Location getLocation(int id) {
		Session session = HibernateUtil.getSession().openSession();
		session.beginTransaction();
		Location l = session.get(Location.class, id);
		session.close();
		return l;
	}
	
	public static List<Location> getAllLocation() {
		Session session = HibernateUtil.getSession().openSession();
		session.beginTransaction();
		List<Location> locations = (List<Location>)session.createQuery("from com.revature.models.Locations").list();
		session.close();
		return locations;
	}
	
}
