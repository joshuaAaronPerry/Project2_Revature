package com.revature.driver;

import java.util.List;

import javax.json.JsonObject;

public interface Dao {

	public TestBean addTest(TestBean t);
	public List<TestBean> getAllTest();
	public TestBean getTest(int tid);
	public void updateTest(int tid, int sid, String name, String status, String error);
	public void deleteTest(int tid);
	
	public MySession addSession(MySession session);
	public void deleteMySession(int sid);
	public List<MySession> getAllSessions();
	public MySession getSession(int sid);
	
	public void toJSON(JsonObject json);
	public JsonObject toJSON(TestBean test); 
	public JsonObject getJson();
	public void writeToJsonFile(JsonObject json);
	JsonObject toJSON(MySession session);
	
}
