package com.revature.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
	
	public static void insertBatch(Batch bat) {
		Session session = HibernateUtil.getSession().openSession();
		Transaction t1 = null;
		try {
			t1 = session.beginTransaction();
			session.save(bat);
			t1.commit();
		} catch (HibernateException h) {
			if (t1 != null) {
				t1.rollback();
			}
		} finally {
			session.close();
		}

	}
	
	public static List<Batch> getAllBatch() {
		Session session = HibernateUtil.getSession().openSession();
		session.beginTransaction();
		List<Batch> batchs = (List<Batch>)session.createQuery("from com.revature.models.Batch").list();
		session.close();
		return batchs;
	}
	
	
}
