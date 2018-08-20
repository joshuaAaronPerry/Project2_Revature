package com.revature.dao;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.Trainer;
import com.revature.util.HibernateUtil;

public class TrainerDao {

	public static Trainer getTrainer(int id) {
		Session session = HibernateUtil.getSession().openSession();
		session.beginTransaction();
		Trainer t = session.get(Trainer.class, id);
		session.close();
		return t;
	}
	
	public static List<Trainer> getAllTrainer() {
		Session session = HibernateUtil.getSession().openSession();
		session.beginTransaction();
		List<Trainer> trainers = (List<Trainer>)session.createQuery("from com.revature.models.Trainer").list();
		session.close();
		return trainers;
	}
	
}
