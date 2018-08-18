package com.revature.dao;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.Skill;
import com.revature.util.HibernateUtil;

public class SkillDao {

	public static Skill getSkill(int id) {
		Session session = HibernateUtil.getSession().openSession();
		session.beginTransaction();
		Skill s = session.get(Skill.class, id);
		session.close();
		return s;
	}
	
	public static List<Skill> getAllSkill() {
		Session session = HibernateUtil.getSession().openSession();
		session.beginTransaction();
		List<Skill> skills = (List<Skill>)session.createQuery("from com.revature.models.Skill").list();
		session.close();
		return skills;
	}
	
}
