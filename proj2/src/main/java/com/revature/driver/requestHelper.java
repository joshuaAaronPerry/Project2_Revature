package com.revature.driver;
import java.io.IOException;

import javax.json.JsonObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class requestHelper {
		public static String processRequest(HttpServletRequest request, HttpServletResponse response)
		{
			DaoImp d = new DaoImp();
			switch(request.getRequestURI())
			{
				case "/proj2/postTest.do":
					System.out.println(request.getRequestURI());
				try {
					response.getWriter().println(d.getJson());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					return("/load.html");
				case "/proj2/getTest.do":
					System.out.println(request.getRequestURI());
					try {
						response.getWriter().println(d.getJson());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return("/load.html");
				default:
					return("/load.html");
			}
		}
}
