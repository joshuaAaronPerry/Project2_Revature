package com.revature.driver;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.driver.requestHelper;

public class MyServlet3 extends HttpServlet{
	private static final long serialVersionUID = 1L;
    DaoImp d = new DaoImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println(d.getJson());
//		request.getRequestDispatcher(requestHelper.processRequest(request, response)).forward(request,
//				response);
//		response.setStatus(response.SC_MOVED_TEMPORARILY);
//		response.setHeader("Location", "C:\\Users\\LiL'Birdman\\Documents\\Project\\Revature\\Project2\\proj2\\test-output\\Default suite\\Default test.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		request.getRequestDispatcher(requestHelper.processRequest(request, response)).forward(request,
//				response);
		response.getWriter().println(d.getJson());

	}
}
