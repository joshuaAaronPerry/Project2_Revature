package com.revature.driver;

import java.io.FileWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DaoImp implements Dao{
	
	public TestBean addTest(TestBean t) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession().openSession();
		Transaction trans = null;

		trans = session.beginTransaction();

		session.save(t);

		session.close();
		
		return t;

	}

	public void addTest(TestTable t) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession().openSession();
		Transaction trans = null;

		trans = session.beginTransaction();

		session.save(t);

		trans.commit();

		session.close();

	}

	public void deleteTest(int id) {
		// TODO Auto-generated method stub

	}

	public List<TestBean> getAllTest() {

		List<TestBean> bean = new ArrayList<>();
		TestBean b = null;
		int i = 1;

		Session session = HibernateUtil.getSession().openSession();

		try {
			while (i < 100) {
				b = getTest(i);
				if (b != null) {
					bean.add(b);

					System.out.println(b.getName());
					System.out.println("Added " + bean.get(i - 1).getName());
				}
				i++;
			}
		} catch (Exception e) {
			System.out.println("Can't");
			e.printStackTrace();

		}
		System.out.println("ended");

		return bean;

	}

	@Override
	public void updateTest(int tid, int sid, String name, String status, String error) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSession().openSession();
		Transaction trans = null;

		trans = session.beginTransaction();

		TestBean test;
		
		test = session.get(TestBean.class, tid);
		
		test.setName(name);
		test.setSid(sid);
		test.setStatus(status);
		test.setError(error);
		
		session.saveOrUpdate(test);
		
		trans.commit();
		session.close();
		
	}

	@Override
	public MySession addSession(MySession session) {
		// TODO Auto-generated method stub

		Session ses = HibernateUtil.getSession().openSession();
		Transaction trans = null;

		trans = ses.beginTransaction();

		ses.save(session);

		trans.commit();

		ses.close();
		
		return session;

	}

	@Override
	public void deleteMySession(int sid) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<MySession> getAllSessions() {
		// TODO Auto-generated method stub
		List<MySession> list = new ArrayList<>();
		MySession s = null;
		int i = 1;

		Session session = HibernateUtil.getSession().openSession();

		try {
			while (i < 100) {
				s = getSession(i);
				if (s != null) {
					list.add(s);
					System.out.println("Added " + list.get(i - 1).getSid());
				}
				i++;
			}
		} catch (Exception e) {
			System.out.println("Can't");
			e.printStackTrace();

		}
		System.out.println("ended");

		return list;
	}

	@Override
	public MySession getSession(int sid) {
		// TODO Auto-generated method stub

		MySession s = null;

		Session session = HibernateUtil.getSession().openSession();
		session.beginTransaction();
		s = session.get(MySession.class, sid);

		session.clear();
		session.close();

		return s;

	}

	public MySession updateSession(int sid, int numOfTest, int numOfInclude, int numOfExclude, int numOfPass, int numOfFail,
			int numOfSkipped) {
		
		MySession s = null;

		Session session = HibernateUtil.getSession().openSession();
		session.beginTransaction();
		s = session.get(MySession.class, sid);

		s.setNumOfTest(numOfTest);
		s.setNumOfInclude(numOfInclude);
		s.setNumOfExclude(numOfExclude);
		s.setNumOfFail(numOfFail);
		s.setNumOfPass(numOfPass);
		s.setNumOfSkipped(numOfSkipped);
		
		session.saveOrUpdate(s);
		
		session.close();

		return s;
	}
	
	@Override
	public void toJSON(JsonObject json) {
		// TODO Auto-generated method stub

	}

	@Override
	public JsonObject getJson() {
		// TODO Auto-generated method stub

		List<TestBean> list = getAllTest();
		List<MySession> slist = getAllSessions();

		JsonObjectBuilder testBuilder = Json.createObjectBuilder();
		JsonObjectBuilder sesBuilder = Json.createObjectBuilder();

		JsonObjectBuilder rootBuilder = Json.createObjectBuilder();

		JsonObject[] jarrTest = new JsonObject[list.size()];
		JsonObject[] jarrSession = new JsonObject[slist.size()];

		JsonArrayBuilder testArrBuilder = Json.createArrayBuilder();
		JsonArrayBuilder sesArrBuilder = Json.createArrayBuilder();

		JsonArray testArr, sesArr;

		//For Test
		
		for (int i = 0; i < list.size(); i++) {

			jarrTest[i] = testBuilder.add("TID", list.get(i).getTid()).add("SID", list.get(i).getSid())
					.add("Name", list.get(i).getName()).add("Status", list.get(i).getStatus())
					.add("Error", ""+list.get(i).getError()).add("Date", "" + getSession(list.get(i).getSid()).getDate()).build();
		}

		for (int i = 0; i < jarrTest.length; i++) {
			testArrBuilder.add(jarrTest[i]);
		}

		testArr = testArrBuilder.build();
		
		//For Session

//		for (int i = 0; i < slist.size(); i++) {
//
//			jarrSession[i] = sesBuilder.add("SID", slist.get(i).getSid()).add("Date",  slist.get(i).getDate().toString())
//					.add("NumberOfTest", slist.get(i).getNumOfTest()).add("NumberOfIncluded", slist.get(i).getNumOfInclude())
//					.add("NumberOfExcluded", slist.get(i).getNumOfExclude()).add("NumberOfPasses", slist.get(i).getNumOfPass())
//					.add("NumberOfFails", slist.get(i).getNumOfFail()).add("NumberOfSkips", slist.get(i).getNumOfSkipped()).build();
//		}
//
//		for (int i = 0; i < jarrSession.length; i++) {
//			sesArrBuilder.add(jarrSession[i]);
//		}
//
//		sesArr = sesArrBuilder.build();

//		JsonObject root = rootBuilder.add("Test", testArr).add("Session", sesArr).build();
		JsonObject root = rootBuilder.add("Test", testArr).build();

		return root;
	}

	@Override
	public TestBean getTest(int tid) {
		// TODO Auto-generated method stub
		TestBean bean = null;

		Session session = HibernateUtil.getSession().openSession();
		session.beginTransaction();
		bean = session.get(TestBean.class, tid);

		session.clear();
		session.close();

		return bean;

	}

	@Override
	public JsonObject toJSON(TestBean test) {
		// TODO Auto-generated method stub

		JsonObjectBuilder job = Json.createObjectBuilder();
		JsonObject json = job.add("TID", test.getTid()).add("SID", test.getSid()).add("Name", test.getName())
				.add("Status", test.getStatus()).add("Error", test.getError()).build();

		return json;
	}

	@Override
	public JsonObject toJSON(MySession session) {
		// TODO Auto-generated method stub

		JsonObjectBuilder job = Json.createObjectBuilder();
		JsonObject json = job.add("SID", session.getSid()).add("Date", (JsonValue) session.getDate())
				.add("NumberOfTest", session.getNumOfTest()).add("NumberOfIncluded", session.getNumOfInclude())
				.add("NumberOfExcluded", session.getNumOfExclude()).add("NumberOfPasses", session.getNumOfPass())
				.add("NumberOfFails", session.getNumOfFail()).add("NumberOfSkips", session.getNumOfSkipped()).build();

		return json;
	}

	@Override
	public void writeToJsonFile(JsonObject json) {
		// TODO Auto-generated method stub
		try {

			FileWriter jfile = new FileWriter(
					"C:\\STSWorkspace\\NewProject2Version\\src\\main\\resources\\MyJson.json");

			jfile.write(json.toString());
			jfile.flush();
			jfile.close();

		} catch (IOException e) {
			System.out.println("Had some Troubling writing to JSON File");
			e.printStackTrace();
		}

	}


}
