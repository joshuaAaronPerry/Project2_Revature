package com.revature.dao;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.Focus;
import com.revature.util.HibernateUtil;

public class FocusDao {

	public static Focus getFocus(int id) {
		Session session = HibernateUtil.getSession().openSession();
		session.beginTransaction();
		Focus f = session.get(Focus.class, id);
		session.close();
		return f;
	}
	
	public static List<Focus> getAllFocus() {
		Session session = HibernateUtil.getSession().openSession();
		session.beginTransaction();
		List<Focus> focus = (List<Focus>)session.createQuery("from com.revature.models.Focus").list();
		session.close();
		return focus;
	}
	
}
