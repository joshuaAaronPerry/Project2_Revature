package com.revature.dao;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.Building;
import com.revature.util.HibernateUtil;

public class BuildingDao {

	public static Building getBuildin(int id) {
		Session session = HibernateUtil.getSession().openSession();
		session.beginTransaction();
		Building b = session.get(Building.class, id);
		session.close();
		return b;
	}
	
	public static List<Building> getAllBuilding() {
		Session session = HibernateUtil.getSession().openSession();
		session.beginTransaction();
		List<Building> buildings = (List<Building>)session.createQuery("from com.revature.models.Building").list();
		session.close();
		return buildings;
	}
	
}
