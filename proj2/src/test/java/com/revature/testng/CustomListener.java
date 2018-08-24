package com.revature.testng;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.revature.driver.DaoImp;
import com.revature.driver.MySession;
import com.revature.driver.TestBean;

public class CustomListener extends TestListenerAdapter{
   private int m_count = 0;
   private int count = 0, pass = 0, fail = 0, skip = 0;
   DaoImp d = new DaoImp();
   private TestBean test = new TestBean();
   private MySession session;
   private List<TestBean> testList = new ArrayList<>(); 
   private String name, status;

   
   @Override
   public void onTestFailure(ITestResult tr) {
      log(tr.getName()+ "--Test method failed\n");
      name = tr.getName();
      status = "Failed";
           
      
      System.out.println(test.toString());
      test.setName(name);
      test.setStatus(status);
      test.setSid(session.getSid());
      
      testList.add(d.addTest(test));
      count++;
      fail++;
      
   }
	 
   @Override
   public void onTestSkipped(ITestResult tr) {
      log(tr.getName()+ "--Test method skipped\n");
      
      test.setName(tr.getName());
      test.setStatus("Skipped");
      test.setError("" + tr.getStatus());
      test.setSid(session.getSid());
      
      
      System.out.println(test.toString());
           
      testList.add(d.addTest(test));
      
      count++;
      skip++;
   }
	 
   @Override
   public void onTestSuccess(ITestResult tr) {
      log(tr.getName()+ "--Test method success\n");
      
      test.setName(tr.getName());
      test.setStatus("Passed");
      test.setError("" + tr.getStatus());
      test.setSid(session.getSid());

      
      
      System.out.println(test.toString());
          
      testList.add(d.addTest(test));
      count++;
      pass++;
   }
	 
   private void log(String string) {
      System.out.print(string);
      if (++m_count % 40 == 0) {
         System.out.println("");
      }
   }
   
   @Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		super.onTestStart(result);
		
		Date date = new Date(System.currentTimeMillis());
		session = new MySession(date, 0, 0, 0, 0, 0, 0);
		session = d.addSession(session);
		
		System.out.println(session.toString());
	}
   
   @Override
	public void onFinish(ITestContext testContext) {
		// TODO Auto-generated method stub
		super.onFinish(testContext);
		Date date = new Date(System.currentTimeMillis());
//		session = new MySession(date, count, 0, 0, pass, fail, skip);
		
		session = d.updateSession(session.getSid(), count, 0, 0, pass, fail, skip);
		System.out.println(session.toString());
		
		d.writeToJsonFile(d.getJson());
	
		
	}

}