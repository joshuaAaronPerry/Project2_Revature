package com.revature.driver;

import java.sql.Date;

import javax.json.JsonObject;

public class HibernateDriver {

public static void main(String[] args) {
		
		TestBean test = new TestBean(1, "ThirdTest", "Expected Failure", "Fail");
		
		DaoImp d = new DaoImp();
		
//		System.out.println(d.addTest(test));
		
		
		
		Date date = new Date(System.currentTimeMillis());
		MySession session = new MySession(date, 5, 1, 0, 4, 0, 0);
		
		MySession empty = new MySession();
		
		
//		System.out.println(d.addSession(empty));
		
//		System.out.println(d.getSession(1).toString());
		
//		System.out.println(d.getAllSessions());
		
//		List<TestBean> list = d.getAllTest();
		
//		System.out.println(list.size());
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).getName());
//		}
		
		JsonObject json = d.getJson();
		System.out.println(json);
		
//		System.out.println(d.getTest(1).toString());
		
		
//		System.out.println(d.toJSON(d.getTest(1)));
//		
//		JsonObject json = d.toJSON(d.getTest(1));
		d.writeToJsonFile(json);
		
		HibernateUtil.closeSession();
	}
}
