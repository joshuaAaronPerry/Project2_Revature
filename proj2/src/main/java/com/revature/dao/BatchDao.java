package com.revature.dao;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.Batch;
import com.revature.util.HibernateUtil;

public class BatchDao {

	public static Batch getBatch(int id) {
		Session session = HibernateUtil.getSession().openSession();
		session.beginTransaction();
		Batch b = session.get(Batch.class, id);
		session.close();
		return b;
	}
	
	public static List<Batch> getAllBatch() {
		Session session = HibernateUtil.getSession().openSession();
		session.beginTransaction();
		List<Batch> batchs = (List<Batch>)session.createQuery("from com.revature.models.Batch").list();
		session.close();
		return batchs;
	}
	
	
}
